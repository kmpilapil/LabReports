package LibraryManagementSystem;

public class LibraryTest {

    public static void main(String[] args) {
        // Create a Library instance
        Library library = new Library();

        // Create and add Book objects to the library
        Book book1 = new Book("Shadow Slave", "GuiltyThree", 15);
        Book book2 = new Book("Kill The Sun", "Warmaisach", 5);
        Book book3 = new Book("Lord of The Mysteries", "Cuttlefish That Loves Diving", 13);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        // Display library details before updates
        //System.out.println("Before update:");
       // library.displayLibrary();
        //Task A: Update the copies of book1 by passing the object
        //library.updateBookCopies(book1, 3);
        // Task B: Update the title of book3 by passing the object
        //library.updateBookTitle(book3, "Lord of Mysteries");
        // Display library details after updating book details
        //System.out.println("\nAfter updating book details:");
       // library.displayLibrary();

        // Task C: Demonstrate passing a primitive (int)
        int originalNumber = 123;
        System.out.println("\nOriginal number before method call: " + originalNumber);
        library.attemptPrimitiveChange(originalNumber);
        System.out.println("Original number after method call: " + originalNumber);
    }
}
