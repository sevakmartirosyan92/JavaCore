package homework.chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println(vol);//обьем weightbox
        System.out.println(weightbox.weight);//вес weightbox

        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println(vol);
    }
}
