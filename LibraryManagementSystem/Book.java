package LibraryManagementSystem;

public class Book {

    private String title;
    private String author;
    private int copies;
    // Constructor to initialize the book details

    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Copies: " + copies);
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
