package Activity4ProblemSet.LibraryLoanSystem;

public class Book {

    private String title;
    private String author;
    private int copies;

    // Parameterized Constructor
    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    // Display Book Information
    public void displayInfo() {
        System.out.println("Title: " + title + " | Author: " + author + " | Copies Available: " + copies);
    }

    // Decrement the number of copies
    public void decrementCopies(int count) {
        if (count <= copies) {
            copies -= count;
        } else {
            System.out.println("Not enough copies to loan from \"" + this.title + "\".");
        }
    }
}
