package classwork.collection.setinterface;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
         Student st1 = new Student("Poxos",5);
         Student st2 = new Student("Petros",1);
         Student st3 = new Student("Mariros",2);
         Student st4 = new Student("Tadeos",3);
         Student st5 = new Student("Gevor",4);

         treeSet.add(st1);
         treeSet.add(st2);
         treeSet.add(st3);
         treeSet.add(st4);
         treeSet.add(st5);
        System.out.println(treeSet);
        Student st6 = new Student("Samvel",3);

        System.out.println(treeSet.first() );
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(st6));

        System.out.println(st4.equals(st6));
    }
}
class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student other) {
        return this.course - other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}