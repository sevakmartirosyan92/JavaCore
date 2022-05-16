package homework.lesson8;

public class ArrayUtil {
    public static void main(String[] args) {
        int array[] = {12, 23, 34, 45, 56, 67, 78, 89, 92, 94};
        int result = 0;
        int i;
        for (i = 0; i < 10; i++)
            result = result + array[i];
        System.out.println(result / 10);
    }
}

