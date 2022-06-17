package classwork.chapter5.homeworks;

public class MissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                    System.out.println("Պողոս");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Պետրոս");
                    break;
                default:
                    System.out.println("Պողոս թե Պետրոս");
            }

        }
    }
}
