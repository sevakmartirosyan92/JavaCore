package homework.books;


import homework.books.commands.Commands;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.Role;
import homework.books.model.User;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.storage.UserStorage;

import java.util.Scanner;

public class BooksDemo implements Commands {

    private static final Scanner scanner = new Scanner(System.in);
    private static final BookStorage bookStorage = new BookStorage();
    private static final AuthorStorage authorStorage = new AuthorStorage();
    private static final UserStorage userStorage = new UserStorage();


    public static void main(String[] args) {
        Author walter = new Author("Jess", "Walter", "jesswalter94.com", "Male");
        Author egan = new Author("Jennifer", "Egan", "jenniferegan74.com", "Female");
        Author kukafka = new Author("Danya", "Kukafka", "danyakukafka88.com", "Female");
        authorStorage.add(walter);
        authorStorage.add(egan);
        authorStorage.add(kukafka);
        //add chq anum vonc tpi
        bookStorage.add(new Book("The Angel of Rome", walter, 60, 4, "short story"));
        bookStorage.add(new Book("The Candy House", egan, 145, 8, "novel"));
        bookStorage.add(new Book("Notes on an Execution", kukafka, 75, 2, "contemporary classic"));
        userStorage.add(new User("Sevak","Marti","sevakmarti@mail.ru","dddd4444",Role.ADMIN));

        boolean run = true;
        while (run) {
            Commands.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                default:
                    System.out.println("Invalid command, please try again");
                    break;
            }
        }

    }

    private static void login() {
        System.out.println("Please input email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User does not exists!");
        } else {
            if (!user.getPassword().equals(emailPassword[1])) {
                System.out.println("Password is wrong!");
            } else {
                if (user.getRole() == Role.ADMIN) {
                    adminLogin();
                } else if (user.getRole() == Role.USER) {
                    userLogin();

                }
            }
        }
    }


    private static void register() {
        System.out.println("Please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Please input correct data");
        } else {
            if (userStorage.getUserByEmail(userData[2]) == null) {

                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setRole(Role.USER);
                userStorage.add(user);
                System.out.println("User registered!");
            } else {
                System.out.println("User with" + userData[2] + "allready exists");
            }
        }

    }

    private static void userLogin() {
        boolean run = true;
        while (run) {
            Commands.printUserCommands();

            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBookByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;

                case PRINT_AUTHOR_BY_NAME:
                    printAuthorByName();
                    break;
                case PRINT_AUTHOR_BY_GENDER:
                    printAuthorsByGender();
                    break;

                default:
                    System.out.println("Invalid command, please try again");
                    break;
            }
        }
    }

    private static void adminLogin() {
        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case LOGOUT:
                    run = false;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBookByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_AUTHOR_BY_NAME:
                    printAuthorByName();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_AUTHOR_BY_GENDER:
                    printAuthorsByGender();
                    break;

                default:
                    System.out.println("Invalid command, please try again");
                    break;
            }
        }
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_BOOK + " for add book");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all books");
        System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR + " for print books by author name");
        System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
        System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
        System.out.println("Plea2se input " + PRINT_AUTHOR_BY_NAME + " for print author by name");
        System.out.println("Please input " + PRINT_AUTHOR_BY_GENDER + " for print author by gender");
        System.out.println("Please input " + PRINT_ALL_AUTHORS + " for print all authors");
    }


    private static void printBooksByAuthorName() {
        System.out.println("Please input author's name");
        String name = scanner.nextLine();
        bookStorage.printBooksByAuthorName(name);
    }

    private static void printAuthorByName() {
        System.out.println("Please input author's name");
        String name = scanner.nextLine();
        authorStorage.printAuthorByName(name);
    }

    private static void printAuthorsByGender() {
        System.out.println("Please input author's gender");
        String gender = scanner.nextLine();
        authorStorage.printAuthorByGender(gender);
    }

    private static void printAuthorByEmail() {
        System.out.println("Please input author's email");
        String email = scanner.nextLine();
        authorStorage.printAuthorByEmail(email);
    }

    private static void printAuthorBySurname() {
        System.out.println("Please input author's surname");
        String surname = scanner.nextLine();
        authorStorage.printAuthorBySurname(surname);
    }


    private static void printBooksByPriceRange() {
        System.out.println("Please input min, max prices");
        String range = scanner.nextLine();
        int min = Integer.parseInt(range.split(",")[0]);
        int max = Integer.parseInt(range.split(",")[1]);
        bookStorage.printBooksByPriceRange(min, max);
    }

    private static void printBookByGenre() {
        System.out.println("Please input book's genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre);
    }

    public static void addAuthor() {
        System.out.println("Please input author name");
        String name = scanner.nextLine();
        System.out.println("Please input author surname");
        String surname = scanner.nextLine();
        System.out.println("Please input author email");
        String email = scanner.nextLine();
        System.out.println("Please input author gender");
        String gender = scanner.nextLine();

        Author author = new Author(name, surname, email, gender);
        authorStorage.add(author);
        System.out.println("Thank you, author added!");
    }

    public static void addBook() {
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        System.out.println("Please input book price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input book count");
        String countStr = scanner.nextLine();
        System.out.println("Please input book genre");
        String genre = scanner.nextLine();


        double price = Integer.parseInt(priceStr);
        int count = Integer.parseInt(countStr);

        Book book = new Book();
        bookStorage.add(book);
        System.out.println("Thank you, book added");
    }
}