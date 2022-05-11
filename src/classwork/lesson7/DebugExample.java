package classwork.lesson7;

public class DebugExample {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 7, 3, 1};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        numbers[0] = 70;
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

    }
}
