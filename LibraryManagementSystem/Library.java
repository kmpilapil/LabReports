package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    // Constructor initializes the books list
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a Book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to update the title of a given Book object
    public void updateBookTitle(Book book, String newTitle) {
        System.out.println("Updating book title from \"" + book.getTitle() + "\" to \"" + newTitle + "\".");
        book.setTitle(newTitle);
    }
    public void updateBookCopies(Book book, int newCopies) {
        System.out.println("Updating copies for \"" + book.getTitle() + "\" from " + book.getCopies() + " to " + newCopies + ".");
        book.setCopies(newCopies);
    }

    // Method to attempt to change a primitive variable (illustrating pass by value)
    public void attemptPrimitiveChange(int number) {
        System.out.println("Inside method before change: " + number);
        number = 999;
        System.out.println("Inside method after change: " + number);
    }

    // Method to display details of all books in the library
    public void displayLibrary() {
        System.out.println("Library Inventory:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}