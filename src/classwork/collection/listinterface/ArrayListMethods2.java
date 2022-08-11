package classwork.collection.listinterface;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Zaven", 'm', 22, 3, 8.3);
        Student st2 = new Student("Aram", 'm', 28, 2, 6.4);
        Student st3 = new Student("Hasmik", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petros", 'm', 35, 4, 7);
        Student st5 = new Student("Anna", 'f', 23, 3, 7.4);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);
        Student st6 = new Student("Anna", 'f', 23, 3, 7.4);
    //        studentList.remove(st6);
        int index = studentList.indexOf(st6);
        System.out.println(index);
    }
}

class Student {
    private final String name;
    private final char gender;
    private final int age;
    private final int course;
    private final double avgGrade;

    public Student(String name, char gender, int age, int course, double avgGrade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + gender +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return gender == student.gender &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

}