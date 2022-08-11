package classwork.collection.listinterface;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Poxos");
        arrayList1.add("Petros");
        arrayList1.add("Martiros");
        arrayList1.add(1,"Meliq");
        for (String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();

        arrayList1.set(1,"Meliq");
        System.out.println(arrayList1);
        }

    }

