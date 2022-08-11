package classwork.collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000,"Poxos Poxosyan");
        map1.put(4500,"Petros Petrosyan");
        map1.put(7500,"Martiros Martirosyan");
        map1.put(5500,"Gevorg Gevorgyan");
        map1.putIfAbsent(1001,"Samvel Samvelyan");//method putIfAbsent(добавляет если key разный!)
        System.out.println(map1);

//        System.out.println(map1.get(1000));//method get(ишет по key,если есть выведит,если нет null!)

//        map1.remove(4500);//method remove(показываем ключ и удаляем!)

        System.out.println(map1.containsKey(4500));//method containsKey(boolean)
        System.out.println(map1.containsValue("Gevorg Gevorgyan"));//method containsValue(boolean)
        System.out.println(map1.keySet());//method keySet(виведит множество ключей)
        System.out.println(map1.values());//method keyValue(виведит множество значений)
        }
}
