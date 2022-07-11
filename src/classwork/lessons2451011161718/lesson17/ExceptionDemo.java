package classwork.lessons2451011161718.lesson17;

public class ExceptionDemo {

    public static void main(String[] args) {
        String a = "+t76";
        try {
            int n = Integer.parseInt(a.trim());
            System.out.println(n * 2);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    static void method1(int t) throws Exception {
        if (t == 8) {
            throw new Exception("inch vor ban");
        }
        System.out.println("sdfgb");
    }

    static void method2() throws Exception {
        method1(4);
    }

}