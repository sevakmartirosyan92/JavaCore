package homework.bracechecker;

public class BraceChecker {

    public String text;
    public Stack mystack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (text) {
                case "(":
                case "{":
                case "[":
                    System.out.println("Error: opened" + c);
                    mystack.push(c);
                    break;
            }
            for (int j = 0; j < text.length(); j++) {
                switch (text) {
                    case ")":
                    case "}":
                    case "]":
                        System.out.println("but closed" + c);
                        mystack.pop();
                        break;
                }

            }
        }
    }
}