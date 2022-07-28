package homework.collection.listinterface;

import java.util.ArrayList;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaven");
        arrayList1.add("Poxos");
        arrayList1.add("Petros");
        arrayList1.add("Martiros");
        arrayList1.add("Pixatos");
        System.out.println("ArrayList =" + arrayList1);
        Object[] array = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[5]);
        for (String s : array2) {
            System.out.println(s);
        }

//        List<String> myList = arrayList1.subList(1, 4);//метод subList(показывает отрывок от индекса до индекса!)
//        System.out.println("SubList" + myList);
//        myList.add("Tadeos");
//        System.out.println("SubList " + myList);
//        System.out.println("ArrayList " + arrayList1);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Petros");
//        arrayList2.add("Poxos");
//        arrayList2.add("Pixatos");

//        arrayList1.removeAll(arrayList2);//метод removeAll(удаляет те же самые елементы,которые есть у обоих!)
//        System.out.println(arrayList1);
//        arrayList1.retainAll(arrayList2);//метод retainAll(печатает то что содержат оба!)
//        System.out.println(arrayList1);
//
//        boolean result = arrayList1.containsAll(arrayList2);//метод containsAll(содержит ли al1 все элементы al2?)
//        System.out.println(result);


    }
}
