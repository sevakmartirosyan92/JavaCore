package homework.bracechecker;

public class BraceCheckerDemo {

    public static void main(String[] args) {

        String text = "Hello (Ja[v)a] {2022}";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
