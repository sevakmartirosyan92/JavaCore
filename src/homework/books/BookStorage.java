package homework.books;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size = 0;


    public void add(Book book) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = book;
    }

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");

        }
    }

    public void printBooksByAuthorName(String autorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(autorName)) {
                System.out.println(array[i]);
            }
        }
    }


    public void printBooksByGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre))
                System.out.println(array[i]);

        }
    }

    public void printBooksByPriceRange(double min, double max) {
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() >= min && array[i].getPrice() <= max) {
                System.out.println(array[i]);
            }


        }
    }
}