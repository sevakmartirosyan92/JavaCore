package classwork.lessons2451011161718.lesson16;

public class MyDemo {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.printAName();
        printKuku5times(a);
        printKuku5times(b);

    }
    static void printKuku5times(MyInterface myInterface){
        for (int i = 0; i < 5; i++) {
            myInterface.printKuku();
        }
    }
}
