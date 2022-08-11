package classwork.collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>();
        Student st1 = new Student("Poxos", "Poxosyan", 3);
        Student st2 = new Student("Petros", "Petrosyan", 1);
        Student st3 = new Student("Martiros", "Martirosyan", 4);
        Student st4 = new Student("Sofi", "Manukyan", 4);
        Student st5 = new Student("Sevak", "Martirosyan", 4);
        Student st6 = new Student("Alina", "Hakobyan", 4);
        Student st7 = new Student("Hayk", "Mkrchyan", 4);
        treeMap.put(st5,7.9);
        treeMap.put(st1,5.8);
        treeMap.put(st3,8.2);
        treeMap.put(st4,6.4);
        treeMap.put(st6,7.2);
        treeMap.put(st2,7.5);
        treeMap.put(st7,9.1);
        System.out.println(treeMap);
        Student st8 = new Student("Hayk", "Mkrchyan", 4);

//        System.out.println(treeMap.tailMap(7.3));//от хвоста до указанного!
//        System.out.println(treeMap.headMap(7.3));//с головы до указанного!
//        System.out.println(treeMap.get(9.1));//method get(по уникальному ключу выводит студента!)
//        treeMap.remove(5.8);
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());//с высшего бала до мальенкого!

    }
}
