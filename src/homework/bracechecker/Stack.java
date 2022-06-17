package homework.bracechecker;

public class Stack {
    private int array[] = new int[10];
    private  int index;

    Stack() {
        index = -1;
    }

    void push(int value) {
        if (index == 9)
            System.out.println("Cтeк заполнен.");
        else
            array[++index] = value;
    }

    int pop() {
        if (index < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else
            return array[index--];
    }
}