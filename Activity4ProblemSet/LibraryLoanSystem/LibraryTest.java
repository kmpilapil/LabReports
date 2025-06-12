package Activity4ProblemSet.LibraryLoanSystem;

public class LibraryTest {

    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("Shadow Slave", "GuiltyThree", 5);
        Book book2 = new Book("Kill The Sun", "Warmaisach", 4);
        Book book3 = new Book("Lord of Mysteries", "Cuttlefish", 3);
        // Create library and add books
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        // Display initial state
        System.out.println("Before Loan:");
        library.displayLibrary();

        // Loan 2 copies of book1
        library.loanBook(book1, 2);

        // Loan 4 copies of book2
        library.loanBook(book2, 4);

        // Attempt to loan more copies than available from book3
        library.loanBook(book3, 4); // Should fail with message
        // Display final state
        System.out.println("\nAfter Loan:");
        library.displayLibrary();
    }
}
