package homework.chapter8;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight   mybox1 = new BoxWeight(7, 5, 3, 4);
        BoxWeight mybox2 = new BoxWeight(5, 5, 5, 5);
        double vol;

        vol = mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weight);


        vol = mybox2.volume();
        System.out.println(vol);
        System.out.println(mybox2.weight);
    }
}
