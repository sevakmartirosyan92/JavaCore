package homework.collection.map_interface;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
            Student st1 = new Student("Poxos", "Poxosyan", 3);
            Student st2 = new Student("Petros", "Petrosyan", 1);
            Student st3 = new Student("Martiros", "Martirosyan", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);

//        Student st4 = new Student("Poxos", "Poxosyan", 3);
//        boolean result = map.containsKey(st4);
//        System.out.println("Result = " + result);

    }
}

    final class Student implements Comparable<Student> {
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

        @Override
        public int compareTo(@NotNull Student o) {
            return this.name.compareTo(o.name);
        }
    }