package classwork.chapter4;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "весне";
        else if (month == 6 || month == 7 || month == 8)
            season = "лето";
         else if (month == 9 || month == 10 || month == 21)
            season = "осень";
        else
            season = "вымышленным месяцам";
        System.out.println("Апрель относится к " + season + ".");

    }
}
