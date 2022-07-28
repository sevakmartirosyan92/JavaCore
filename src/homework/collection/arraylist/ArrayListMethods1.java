package homework.collection.arraylist;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1,"Misha");
        for (String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();

        arrayList1.set(1,"Masha");
        System.out.println(arrayList1);
        }

    }

