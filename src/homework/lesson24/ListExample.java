package homework.lesson24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("poxos");
        for (int i = 0; i < 1000; i++) {
            arrayList.add("poxos" + i);
        }

        arrayList.add("poxos");
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
