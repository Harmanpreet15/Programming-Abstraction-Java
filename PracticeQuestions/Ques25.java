// Q25. Build a simple Library Management System using OOP concepts where you can:
// Add Book
// Issue Book
// Return Book
// Display Available Books


import java.util.ArrayList;

class Book {
    int id;
    String title;
    boolean issued;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.issued = false;
    }
}

class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(int id, String title) {
        Book book = new Book(id, title);
        books.add(book);

        System.out.println("Book added successfully.");
    }

    void issueBook(int id) {

        for (Book book : books) {

            if (book.id == id) {

                if (!book.issued) {
                    book.issued = true;
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book is already issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    void returnBook(int id) {

        for (Book book : books) {

            if (book.id == id) {

                if (book.issued) {
                    book.issued = false;
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }

    void displayAvailableBooks() {

        System.out.println("\n--- Available Books ---");

        for (Book book : books) {

            if (!book.issued) {
                System.out.println(
                    "ID: " + book.id +
                    ", Title: " + book.title
                );
            }
        }
    }
}

public class Ques25 {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(1, "Java Programming");
        library.addBook(2, "Data Structures");
        library.addBook(3, "Machine Learning");

        library.displayAvailableBooks();

        library.issueBook(2);

        library.displayAvailableBooks();

        library.returnBook(2);

        library.displayAvailableBooks();
    }
}