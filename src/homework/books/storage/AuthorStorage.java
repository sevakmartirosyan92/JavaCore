package homework.books.storage;
import homework.books.model.Author;

public class AuthorStorage {
    private Author[] array = new Author[10];
    private int size = 0;


    public void add(Author author) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = author;
    }

    private void increaseArray() {
        Author[] temp = new Author[array.length + 10];
        System.arraycopy(array, 0, temp, 0, size);
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");

        }
    }


    public void printAuthorBySurname(String surname) {
        for (int i = 0; i < size; i++) {
            if (array[i].getSurname().equals(surname)) {
                System.out.println(array[i]);
            }
        }
    }

    public void printAuthorByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().equals(email)) {
                System.out.println(array[i]);
            }
        }
    }

    public void printAuthorByGender(String gender) {
        if (!"Male".equalsIgnoreCase(gender) ||
                !"Female".equalsIgnoreCase(gender)) ;
        return;
    }


    public void printAuthorByName(String name) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equals(name)) {
                System.out.println(array[i]);
            }
        }
    }
}
