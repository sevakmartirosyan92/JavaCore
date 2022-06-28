package homework.books;

import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        bookStorage.add(new Book("The Angel of Rome", "Jess Walter", 60, 4, "short story"));
        bookStorage.add(new Book("The Candy House", "Jennifer Egan", 145, 8, "novel"));
        bookStorage.add(new Book("Notes on an Execution", "Danya Kukafka", 75, 2, "contemporary classic"));


        boolean run = true;
        while (run) {
            System.out.println("Please input " + EXIT + " for exit");
            System.out.println("Please input " + ADD_BOOK + " for add book");
            System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all books");
            System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by author name");
            System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
            System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBookByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    break;
                default:
                    System.out.println("Invalid command, please try again");
                    break;
            }
        }
    }

    private static void printBookByGenre() {
        System.out.println("Please input book's genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    private static void printBooksByAuthorName() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(authorName);
    }

    public static void addBook() {
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        System.out.println("Please input book authorname");
        String authorname = scanner.nextLine();
        System.out.println("Please input book price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input book count");
        String countStr = scanner.nextLine();
        System.out.println("Please input book genre");
        String genre = scanner.nextLine();

        double price = Integer.parseInt(priceStr);
        int count = Integer.parseInt(countStr);
        Book book = new Book(title, authorname, price, count, genre);
        bookStorage.add(book);
        System.out.println("Thank you, book added");
    }
}

