package classwork.chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(7, 5, 3, 4);
        BoxWeight mybox2 = new BoxWeight(5, 5, 5, 0.5);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(4, 5);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println(vol);//обьем
        System.out.println(mybox1.weight);//вес
        System.out.println();

        vol = mybox2.volume();
        System.out.println(vol);//обьем
        System.out.println(mybox2.weight);//вес
        System.out.println();

        vol = mybox3.volume();
        System.out.println(vol);//обьем
        System.out.println(mybox3.weight);//вес
        System.out.println();

        vol = myclone.volume();
        System.out.println(vol);//обьем
        System.out.println(myclone.weight);//вес
        System.out.println();

        vol = mycube.volume();
        System.out.println(vol);//обьем
        System.out.println(mycube.weight);//вес
        System.out.println();

    }
}
