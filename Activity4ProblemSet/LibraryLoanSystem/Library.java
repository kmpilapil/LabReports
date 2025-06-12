package Activity4ProblemSet.LibraryLoanSystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Loan a book: decrement copies
    public void loanBook(Book book, int loanCount) {
        if (books.contains(book)) {
            book.decrementCopies(loanCount);
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    // Display all books in the library
    public void displayLibrary() {
        System.out.println("Library Inventory:");
        for (Book b : books) {
            b.displayInfo();
        }
    }
}
