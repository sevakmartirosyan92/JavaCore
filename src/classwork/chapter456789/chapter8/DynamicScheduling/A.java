package classwork.chapter456789.chapter8.DynamicScheduling;

class A {
    void callme() {
        System.out.println("B методе callme() из класса А");
    }
}

class B extends A {
    void callme() {
        System.out.println("B методе callme() из класса B");
    }
}

class C extends A {
    void callme() {
        System.out.println("B методе callme() из класса C");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}