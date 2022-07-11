package classwork.chapter456789.chapter5.homeworks;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;
        if (num < 2) isPrime = false;
        else isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Пpocтoe число");
        else System.out.println("He простое число");
    }
}

