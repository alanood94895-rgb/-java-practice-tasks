import java.util.HashMap;

public class BookAuthorDemo {

    // Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (String = Book Title, String = Author Name)
        HashMap<String, String> bookAuthorDemo = new HashMap<>();

        // Add 5 book-author records using put()
        bookAuthorDemo.put("Harry Potter", "J.K. Rowling");
        bookAuthorDemo.put("The Hobbit", "J.R.R. Tolkien");
        bookAuthorDemo.put("1984", "George Orwell");
        bookAuthorDemo.put("To Kill a Mockingbird", "Harper Lee");
        bookAuthorDemo.put("The Alchemist", "Paulo Coelho");

        // Display all elements
        System.out.println("Book List:");
        System.out.println(bookAuthorDemo);

        // Use get() to display author of one specific book
        System.out.println("Author of The Hobbit: " + bookAuthorDemo.get("The Hobbit"));

        // Use containsKey() to check whether book exists
        System.out.println("Does 1984 exist? " + bookAuthorDemo.containsKey("1984"));

        // Update author of one book using put()
        bookAuthorDemo.put("1984", "George Orwell Updated");

        // Display updated HashMap
        System.out.println("After updating author of 1984:");
        System.out.println(bookAuthorDemo);

        // Remove one book record
        bookAuthorDemo.remove("The Alchemist");

        // Display HashMap after removal
        System.out.println("After removing The Alchemist:");
        System.out.println(bookAuthorDemo);

        // Display total number of records left
        System.out.println("Total number of books: " + bookAuthorDemo.size());
    }
}