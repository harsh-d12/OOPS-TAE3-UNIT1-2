import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    // Constructor
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add book
    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully.");
    }

    // Remove book by ISBN
    void removeBook(String ISBN) {
        for (Book b : books) {
            if (b.ISBN.equals(ISBN)) {
                books.remove(b);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Display all books
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            b.displayBook();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "101");
        Book b2 = new Book("OOP Concepts", "Bjarne Stroustrup", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("\nAvailable Books:");
        lib.displayBooks();

        lib.removeBook("101");

        System.out.println("\nBooks after removal:");
        lib.displayBooks();
    }
}
