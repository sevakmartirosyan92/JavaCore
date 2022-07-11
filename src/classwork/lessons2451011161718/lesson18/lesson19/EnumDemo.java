package classwork.lessons2451011161718.lesson18.lesson19;

public class EnumDemo {

    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;
        System.out.println(ap);
        System.out.println();

        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel)
            System.out.println("Переменная ар содержит GoldenDel.\n");

        switch (ap) {
            case Jonathan:
                System.out.println("Сорт Jonathan красный");
                break;
            case GoldenDel:
                System.out.println("Сорт GoldenDelicious желтый");
                break;
            case RedDel:
                System.out.println("Copт Red Delicious красный");
                break;
            case Winesap:
                System.out.println("Copт Winesap красный");
                break;
            case Cortland:
                System.out.println("Copт Cortland красный");
                break;

        }
    }


}
