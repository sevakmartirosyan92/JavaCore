package homework.books;

import classwork.students.Student;

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
            if (array[i].getGenre().contains(genre))
                System.out.println(array[i]);

        }
    }

    public void printBooksByPriceRange(int min, int max) {
        for (int i = 0; i < size; i++) {
            Book book = array[i];
            if (book.getPrice() >= min && book.getPrice() <= max) {
                System.out.println(book);
            }


        }
    }
}