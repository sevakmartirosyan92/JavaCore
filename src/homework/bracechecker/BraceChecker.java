package homework.bracechecker;

public class BraceChecker {

    public String text;
    private final Stack stack = new Stack();

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pop;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                     pop = stack.pop();
                    if (pop == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (pop != '(') {
                        System.err.println("Error: closed " + c + " but opened "+ (char)pop + " at " + i);
                    }
                    break;
                    case '}':
                     pop = stack.pop();
                    if (pop == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (pop != '{') {
                        System.err.println("Error: closed " + c + " but opened "+ (char)pop + " at " + i);
                    }
                    break;
                    case ']':
                     pop = stack.pop();
                    if (pop == 0) {
                        System.err.println("Error: closed " + c + " but not opened at " + i);
                    } else if (pop != '[') {
                        System.err.println("Error: closed " + c + " but opened "+ (char)pop + " at " + i);
                    }
                    break;
            }
        }
    }
}