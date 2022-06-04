package homework.arrayUtil;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ', ' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' ', ' '};
        int startIndex = 0;
        int endIndex = spaceArray.length - 1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[startIndex] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }
        for (int j = endIndex; j > 0; j--) {
            if (spaceArray[endIndex - 1] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }
        int newlength = (endIndex - startIndex) + 1;
        char[] result = new char[newlength];
        int j = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[j++] = spaceArray[i];
        }
        for (char c : result) {
            System.out.print(c);
        }
    }
}