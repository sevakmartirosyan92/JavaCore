package classwork.lesson17;

public class ExceptionDemo {

    public static void main(String[] args) {
        int d = 0;
        try {
            int a = 42 / d;
            System.out.println(a);
        } catch (ArithmeticException e) {//это является простым классом!!!
            System.out.println("Please change your number. Divide by 0");
        }



        System.out.println("Hello");
        System.out.println("Java");
    }
}