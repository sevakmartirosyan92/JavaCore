package homework.collection.listinterface;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] array = {sb1, sb2, sb3, sb4};

        List<StringBuilder> list = Arrays.asList(array);//метод asList(неважно что меняем всегда array=list)
        System.out.println(list);
        array[0] = new StringBuilder("F");
        System.out.println(list);
    }
}
