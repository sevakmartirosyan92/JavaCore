package homework.books.commands;

public interface Commands {
    int LOGOUT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHOR = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_AUTHOR_BY_NAME = 7;
    int PRINT_ALL_AUTHORS = 8;
    int PRINT_AUTHOR_BY_GENDER = 9;

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;

    static void printCommands() {
        System.out.println("Please input " + LOGOUT + " for LOGOUT");
        System.out.println("Please input " + ADD_BOOK + " for add book");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all books");
        System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR + " for print books by author");
        System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
        System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
        System.out.println("Please input " + PRINT_AUTHOR_BY_NAME + " for print author by name");
        System.out.println("Please input " + ADD_AUTHOR + " for add author");
        System.out.println("Please input " + PRINT_AUTHOR_BY_GENDER + " for print all lessons");

    }

    static void printLoginCommands() {
        System.out.println("Please input " + LOGOUT + " for logout");
        System.out.println("Please input " + LOGIN + " for login");
        System.out.println("Please input " + REGISTER + " for register");

    }

    static void printUserCommands() {
        System.out.println("Please input " + LOGOUT + " for LOGOUT");
        System.out.println("Please input " + ADD_BOOK + " for add book");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all books");
        System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
        System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
        System.out.println("Please input " + PRINT_AUTHOR_BY_NAME + " for print author by name");
            System.out.println("Please input " + PRINT_AUTHOR_BY_GENDER + " for print all lessons");
    }
}
