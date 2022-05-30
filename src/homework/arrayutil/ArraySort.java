package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int temp;
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j - 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j - 1];
                    numbers[j - 1] = temp;
                }
            }
        }
        for (int x : numbers) {
            System.out.print(x + " ");
        }
    }
}

