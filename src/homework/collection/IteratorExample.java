package homework.collection;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaven");
        arrayList1.add("Poxos");
        arrayList1.add("Petros");
        arrayList1.add("Martiros");
        arrayList1.add("Pixatos");

        Iterator<String> iterator = arrayList1.iterator();//method iterator(бегает по каждому элементу)
        while (iterator.hasNext()){ //method hasNext(есть ли следуюший элемент?)
            iterator.next();//method next(получаем этот элемент)
            iterator.remove();//method remove(стирает каждый находяший элемент)
        }
        System.out.println(arrayList1);
    }
}
