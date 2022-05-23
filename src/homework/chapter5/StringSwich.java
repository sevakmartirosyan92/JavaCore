package homework.chapter5;

public class StringSwich {
    public static void main(String[] args) {
        String str = "Պողոս";
        switch (str){
            case "Կարեն":
                System.out.println("Կարեն");
                break;
            case "Պողոս":
                System.out.println("Պողոս");
                break;
            case "Մանուկ":
                System.out.println("Մանուկ");
                break;
            default:
                System.out.println("Պետրոս");
        }
    }
}
