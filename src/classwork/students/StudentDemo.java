package classwork.students;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();


    public static void main(String[] args) {
         studentStorage.add(new Student("Poxos","Poxosyan",25,"095658474","Gyumri","Java"));
         studentStorage.add(new Student("Petros","Petrosyan",35,"095522222","Erevan","Python"));
         studentStorage.add(new Student("Martiros","Martirosyan",45,"095650000","Vnadzor","English"));

        boolean run = true;

        while (run) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add student");
            System.out.println("Please input 2 for print all students");
            System.out.println("Please input 3 for print students count");
             System.out.println("Please input 4 for delete student by index");
            System.out.println("Please input 5 for print students by lesson");
            System.out.println("Please input 6 for student,s lesson");


            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    System.out.println(studentStorage.getSize());
                    break;
                case 4:
                    deleteStudentByIndex();
                    break;
                case 5:
                    searchStudentByLessonName();
                case 6:
                    changeStudentLesson();
                default:
                    System.out.println("Invalid command, please try again");
                    break;
            }
        }
    }

    private static void changeStudentLesson() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student != null) {
            System.out.println("Please input new lesson name");
            String lessonName = scanner.nextLine();
            if (lessonName !=null||lessonName.trim().equals("")){
                student.setLesson(lessonName.trim());
                System.out.println("lesson changed for student " + student.getName() + " " + student.getSurname());
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
        System.out.println("Please input student lesson");
        String lesson = scanner.nextLine();
        System.out.println("Please choose student index");
        String deleteIndex = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("Thank you, student added");
    }
}
