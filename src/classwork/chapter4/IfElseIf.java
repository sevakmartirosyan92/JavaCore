package classwork.chapter4;

public class IfElseIf {
    public static void main(String[] args) {
        int hours = 6;
        String days;
        if (hours == 2 || hours == 6 || hours == 8)
            days = "день";
        else if (hours == 1 || hours == 5 || hours == 9)
            days = "вечер";
        else if (hours != 3 || hours >= 4|| hours == 7)
            days = "ночь";
        else
            days = "не совпадает с реальностью";
        System.out.println("Время 6 это " + days + "!");

    }
}
