package classwork.lesson10;

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box(5,7,10);

        double vol = box1.volume();
        System.out.println(vol);
        System.out.println(vol * 2);

        Box box2 = new Box(2,6,8);


        System.out.println(box2.volume());
    }
}
