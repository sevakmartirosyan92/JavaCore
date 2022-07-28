package homework.generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(5);
        al1.add(12);
        al1.add(15);
        al1.add(8);
        al1.add(40);
        Integer secondElement = GenMethod.getSecondElement(al1);
        System.out.println(secondElement);

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("dddd");
        al2.add("fffff");
        al2.add("ggggggg");
        String secondElement1 = GenMethod.getSecondElement(al2);
        System.out.println(secondElement1);

    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}