package homework.lesson8;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {3, 30, 8, 14, 35, 23, 26, 31, 17, 5};
        //Տպել մասիվի բոլոր էլեմենտները:
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

//Տպել մասիվի ամենամեծ թիվը:
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("max = " + max);
        //Տպել մասիվի ամենափոքր թիվը:
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
        //Տպել մասիվի զույգ էլեմենտները:
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        //Տպել մասիվի կենտ էլեմենտները:
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
        //Տպեք կենտերի քանակը:
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("oddCount " + oddCount);
        //Տպել զույգերի քանակը:
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("evenCount " + evenCount);
        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա):
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum " + sum / array.length);
        //Տպեք մասիվի էլեմենտների գումարը։
        int mean = 0;
        for (int i = 0; i < array.length; i++) {
            mean += array[i];
        }
        System.out.println("mean " + mean);
    }
}









