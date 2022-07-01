package homework.students;

import homework.students.command.CommandsStudent;
import homework.students.model.Lesson;
import homework.students.model.Student;
import homework.students.storage.LessonStorage;
import homework.students.storage.StudentStorage;

import java.util.*;

public class StudentDemo implements CommandsStudent {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentStorage studentStorage = new StudentStorage();
    private static final LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson java = new Lesson("Java", "teachername 1", 7, 35);
        lessonStorage.add(java);
        Lesson java_script = new Lesson("Java script", "teachername 2", 3, 20);
        lessonStorage.add(java_script);
        Lesson mysql = new Lesson("mysql", "teachername 3", 5, 25);
        lessonStorage.add(mysql);

        studentStorage.add(new Student("Poxos", "Poxosyan", 25, "095658474", "Gyumri", java));
        studentStorage.add(new Student("Petros", "Petrosyan", 35, "095522222", "Erevan", java_script));
        studentStorage.add(new Student("Martiros", "Martirosyan", 45, "095650000", "Vnadzor", mysql));

        boolean run = true;

        while (run) {
            CommandsStudent.printCommands();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
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
                case CHANGE_STUDENT_LESSON:
                    changeStudentLesson();
                case ADD_LESSON:
                    addLesson();
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command, please try again");
                    break;
            }
        }
    }

    private static void addLesson() {
        System.out.println("Please input lesson name");
        String name = scanner.nextLine();

        System.out.println("Please input lesson price");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Please input lesson teacher name");
        String teacherName = scanner.nextLine();

        System.out.println("Please input lesson duration by moth");
        int duration = Integer.parseInt(scanner.nextLine());

        Lesson lesson = new Lesson(name, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("lesson created!");
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
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("Please input correct index");
                changeStudentLesson();
            } else {
                student.setLesson(lesson);
                System.out.println("Lesson changed!");
            }
        } else {
            System.out.println("invalid index, please try again");
        }
    }

    private static void searchStudentByLessonName() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printByLesson(lessonName);
    }

    private static void deleteStudentByIndex() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }

    private static void addStudent() {
        if (lessonStorage.getSize() == 0) {
            System.out.println("Please add lesson");
            addLesson();
        } else {
            lessonStorage.print();
            System.out.println("Please choose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("Please input correct index");
                addStudent();
            } else {
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
                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("Thank you, student added");
            }


        }


    }
}
