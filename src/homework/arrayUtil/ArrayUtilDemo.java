package homework.arrayUtil;

import java.io.PrintStream;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 9, 12, 25, 34};
        ArrayUtil au = new ArrayUtil();
        au.print(array);
        System.out.println();

        int max = au.max(array);
        System.out.println(max);

        int min = au.min(array);
        System.out.println(min);
        au.printOddEl(array);

        System.out.println();
        au.printEvenEl(array);

        System.out.println();
        au.printOddCount(array);
        au.printEvenCount(array);

        au.sum(array);
        au.setMean(array);


        au.sortFromMin(array);
        System.out.println();
        au.sortFromMin(array);

    }

}
