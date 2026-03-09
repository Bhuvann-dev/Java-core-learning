class Book {
    String title;
    Book(String title) { this.title = title; }
}

class Library {
    private Book book; // Aggregation
    void setBook(Book book) { this.book = book; }
    void showBook() { System.out.println("Library has: " + book.title); }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b = new Book("Java Mastery");
        Library lib = new Library();
        lib.setBook(b);
        lib.showBook();
    }
}