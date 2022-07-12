package homework.students;


import homework.students.commands.Commands;
import homework.students.exception.LessonNotFoundException;
import homework.students.model.Lesson;
import homework.students.model.Student;
import homework.students.model.User;
import homework.students.model.Role;
import homework.students.storage.LessonStorage;
import homework.students.storage.StudentStorage;
import homework.students.storage.UserStorage;


import java.util.Scanner;

import static homework.students.commands.Commands.*;

public class StudentDemo {

        private static final Scanner scanner = new Scanner(System.in);
        private static final StudentStorage studentStorage = new StudentStorage();
        private static final LessonStorage lessonStorage = new LessonStorage();
        private static final UserStorage userStorage = new UserStorage();

        private static User currentUser = null;

    public static void main(String[] args) {
        Lesson java = new Lesson("java", "teacher name 1", 33, 55);
        lessonStorage.add(java);
        Lesson javaScript = new Lesson("java script", "teacher name 2", 33, 55);
        lessonStorage.add(javaScript);
        Lesson mysql = new Lesson("mysql", "teacher name 3", 33, 55);
        lessonStorage.add(mysql);

        User admin = new User("admin", "admin", "admin@mail.com", "admin", Role.ADMIN);
        userStorage.add(admin);
        studentStorage.add(new Student("Poxos", "Poxosyan", 13, "1234567", "Gyumri", java, admin));
        studentStorage.add(new Student("Petros", "Poxosyan", 13, "1234567", "Gyumri", mysql, admin));
        studentStorage.add(new Student("Martiros", "Poxosyan", 13, "1234567", "Gyumri", javaScript, admin));

        boolean run = true;
        while (run) {
            Commands.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                default:
                    System.out.println("Invalid command, please try again");
            }
        }

    }

        private static void login() {
            System.out.println("please input email,password");
            String emailPasswordStr = scanner.nextLine();
            String[] emailPassword = emailPasswordStr.split(",");
            User user = userStorage.getUserByEmail(emailPassword[0]);
            if (user == null) {
                System.out.println("User does not exists!");
            } else {
                if (!user.getPassword().equals(emailPassword[1])) {
                    System.out.println("Password is wrong!");
                } else {
                    currentUser = user;
                    if (user.getRole() == Role.ADMIN) {
                        adminLogin();
                    } else if (user.getRole() == Role.USER) {
                        userLogin();
                    }
                }
            }

        }


        private static void register() {
            System.out.println("Please input name,surname,email,password");
            String userDataStr = scanner.nextLine();
            String[] userData = userDataStr.split(",");
            if (userData.length < 4) {
                System.out.println("please input correct user data");
            } else {
                if (userStorage.getUserByEmail(userData[2]) == null) {
                    User user = new User("admin", "admin", "admin@mail.com", "admin", Role.ADMIN);
                    user.setName(userData[0]);
                    user.setSurname(userData[1]);
                    user.setEmail(userData[2]);
                    user.setPassword(userData[3]);
                    user.setRole(Role.USER);
                    userStorage.add(user);
                    System.out.println("User registered!");
                } else {
                    System.out.println("User with " + userData[2] + " already exists");
                }
            }
        }


        private static void userLogin() {
            System.out.println("Welcome, " + currentUser.getName());
            boolean run = true;
            while (run) {
                Commands.printUserCommands();
                int command;
                try {
                    command = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    command = -1;
                }
                switch (command) {
                    case LOGOUT:
                        currentUser = null;
                        run = false;
                        break;
                    case ADD_STUDENT:
                        addStudent();
                        break;
                    case PRINT_ALL_STUDENTS:
                        studentStorage.print();
                        break;
                    case PRINT_STUDENTS_COUNT:
                        System.out.println(studentStorage.getSize());
                        break;
                    case PRINT_STUDENTS_BY_LESSON:
                        searchStudentByLessonName();
                        break;
                    case PRINT_ALL_LESSONS:
                        lessonStorage.print();
                        break;
                    default:
                        System.out.println("Invalid command, please try again");
                }
            }
        }

        private static void adminLogin() {
            boolean run = true;
            while (run) {
                Commands.printCommands();
                int command;
                try {
                    command = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    command = -1;
                }
                switch (command) {
                    case LOGOUT:
                        currentUser = null;
                        run = false;
                        break;
                    case ADD_STUDENT:
                        addStudent();
                        break;
                    case PRINT_ALL_STUDENTS:
                        studentStorage.print();
                        break;
                    case PRINT_STUDENTS_COUNT:
                        System.out.println(studentStorage.getSize());
                        break;
                    case DELETE_STUDENT_BY_INDEX:
                        deleteStudentByIndex();
                        break;
                    case PRINT_STUDENTS_BY_LESSON:
                        searchStudentByLessonName();
                        break;
                    case CHANGE_STUDENT_LESSON:
                        changeStudentLesson();
                        break;
                    case ADD_LESSON:
                        addLesson();
                        break;
                    case PRINT_ALL_LESSONS:
                        lessonStorage.print();
                        break;
                    default:
                        System.out.println("Invalid command, please try again");
                }
            }
        }

        private static void addLesson() {

            System.out.println("Please input lesson name");
            String name = scanner.nextLine();

            System.out.println("Please input lesson price");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.println("Please input lesson duration by month");
            int duration = Integer.parseInt(scanner.nextLine());

            System.out.println("Please input lesson teacher name");
            String teacherName = scanner.nextLine();

            Lesson lesson = new Lesson(name, teacherName, duration, price);
            lessonStorage.add(lesson);
            System.out.println("Lesson created!");

        }

        private static void searchStudentByLessonName() {
            System.out.println("please input lesson name");
            String lessonName = scanner.nextLine();
            studentStorage.printStudentsByLesson(lessonName);
        }

        private static void deleteStudentByIndex() {
            studentStorage.print();
            System.out.println("Please choose student index");
            int index = Integer.parseInt(scanner.nextLine());
            studentStorage.delete(index);
        }

        private static void changeStudentLesson() {
            studentStorage.print();
            System.out.println("Please choose student index");
            int index = Integer.parseInt(scanner.nextLine());
            Student student = studentStorage.getStudentByIndex(index);
            if (student != null) {
                lessonStorage.print();
                System.out.println("Please choose lesson index");
                int lessonIndex = Integer.parseInt(scanner.nextLine());
                try {
                    Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                    student.setLesson(lesson);
                    System.out.println("Lesson changed!");
                } catch (LessonNotFoundException e) {
                    System.out.println(e.getMessage());
                    changeStudentLesson();
                }
            } else {
                System.out.println("invalid index, please try again");
                changeStudentLesson();
            }


        }

        private static void addStudent() {
            if (lessonStorage.getSize() == 0) {
                System.out.println("Please add lesson");
                addLesson();
            } else {
                lessonStorage.print();
                System.out.println("Please choose lesson index");
                int lessonIndex = Integer.parseInt(scanner.nextLine());
                try {
                    Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                    System.out.println("Please input student name");
                    String name = scanner.nextLine();
                    System.out.println("Please input student surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input student age");
                    String ageStr = scanner.nextLine();
                    System.out.println("Please input student phoneNumber");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("Please input student city");
                    String city = scanner.nextLine();

                    int age = Integer.parseInt(ageStr);
                    Student student = new Student(name, surname, age, phoneNumber, city, lesson, currentUser);
                    studentStorage.add(student);
                    System.out.println("Thank you, Student added");
                } catch (LessonNotFoundException e) {
                    System.out.println(e.getMessage());
                    addStudent();
                }

            }


        }
    }
