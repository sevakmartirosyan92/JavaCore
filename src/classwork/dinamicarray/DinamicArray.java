package classwork.dinamicarray;

public class DinamicArray {
    int[] array = new int[10];
    int size = 0;


    void add(int value) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = value;
    }

    private void increaseArray() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }
}