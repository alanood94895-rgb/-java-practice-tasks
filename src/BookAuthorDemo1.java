import java.util.HashMap;

public class BookAuthorDemo1 {

    // Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (String = Book Title, String = Author Name)
        HashMap<String, String> bookAuthorDemo1 = new HashMap<>();

        // Add 5 book-author records using put()
        bookAuthorDemo1.put("Harry Potter", "J.K. Rowling");
        bookAuthorDemo1.put("The Hobbit", "J.R.R. Tolkien");
        bookAuthorDemo1.put("1984", "George Orwell");
        bookAuthorDemo1.put("To Kill a Mockingbird", "Harper Lee");
        bookAuthorDemo1.put("The Alchemist", "Paulo Coelho");

        // Display all elements
        System.out.println("Book List:");
        System.out.println(bookAuthorDemo1);

        // Use get() to display author of one specific book
        System.out.println("Author of 1984: " + bookAuthorDemo1.get("1984"));

        // Use containsKey() to check whether one book exists
        System.out.println("Does The Hobbit exist? " + bookAuthorDemo1.containsKey("The Hobbit"));

        // Use containsKey() again to check a book that does not exist
        System.out.println("Does Atomic Habits exist? " + bookAuthorDemo1.containsKey("Atomic Habits"));

        // Update author of one book using put()
        bookAuthorDemo1.put("1984", "George Orwell Updated");

        // Display updated HashMap
        System.out.println("After updating author of 1984:");
        System.out.println(bookAuthorDemo1);

        // Remove one book record
        bookAuthorDemo1.remove("The Alchemist");

        // Display HashMap after removal
        System.out.println("After removing The Alchemist:");
        System.out.println(bookAuthorDemo1);

        // Display total number of records left
        System.out.println("Total number of books: " + bookAuthorDemo1.size());
    }
}