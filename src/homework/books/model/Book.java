package homework.books.model;

public class Book {
        private String title;
        private Author author;
        private double price;
        private int count;
        private String genre;


        public Book() {
        }

        public Book(String title, Author author, double price, int count, String genre) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.count = count;
            this.genre = genre;


        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", authorName='" + author + '\'' +
                    ", price=" + price +
                    ", count=" + count +
                    ", genre='" + genre + '\'' +
                    '}';
        }
    }

