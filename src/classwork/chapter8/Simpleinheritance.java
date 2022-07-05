package classwork.chapter8;

public class Simpleinheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        //суперкласс может использоватся самостоятельно!
        superOb.i = 10;
        superOb.j = 20;
        superOb.showij();
        System.out.println();

        // Подкласс имеет доступ ко всем открытым членам своего суперкласса!
        subOb.i = 7;
        subOb.j = 10;
        subOb.k = 15;
        subOb.showij();
        subOb.showk();
        System.out.println();

        subOb.sum();
    }
}
