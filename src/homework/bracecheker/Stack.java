package homework.bracecheker;

public class Stack {
    private int stck[] = new int[10];
    private  int index;

    Stack() {
        index = -1;
    }

    void push(int value) {
        if (index == 9)
            System.out.println("Cтeк заполнен.");
        else
            stck[++index] = value;
    }

    int pop() {
        if (index < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        } else
            return stck[index--];
    }
}