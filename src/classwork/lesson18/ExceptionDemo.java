package classwork.lesson18;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            printStringWithoutWhiteSpase("null");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (NoWhiteSpaseException e){
            System.out.println(e.getMessage());
        }
        System.out.println("After try block");
    }

    static void printStringWithoutWhiteSpase(String name) {
        if (name == null) {
            throw new NullPointerException("name is null");
        }
        if (name.equals("")) {
            throw new IllegalArgumentException("name can't be empty");
        }
        if (!name.contains(" ")) {
            throw new NoWhiteSpaseException("name does not contains white spaces");
        }
        System.out.println(name.trim());
    }
}
