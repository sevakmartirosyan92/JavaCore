package classwork.chapter7;

public class Test1 {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }
    int getc(){
        return c;
    }
}

class AccessTest{
    public static void main(String[] args) {
        Test1 ob = new Test1();
        ob.a = 10;
        ob.b = 20;
        ob.setc(100);
        System.out.println("a, b, с: " + ob.a + " "
                + ob.b + " " + ob.getc());

    }
}
