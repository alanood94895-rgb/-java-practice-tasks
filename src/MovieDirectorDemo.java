import java.util.HashMap;

public class MovieDirectorDemo {

    // Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (String = Movie Title, String = Director Name)
        HashMap<String, String> movieDirectorDemo = new HashMap<>();

        // Add 5 movie-director records using put()
        movieDirectorDemo.put("Inception", "Christopher Nolan");
        movieDirectorDemo.put("Titanic", "James Cameron");
        movieDirectorDemo.put("Avatar", "James Cameron");
        movieDirectorDemo.put("Interstellar", "Christopher Nolan");
        movieDirectorDemo.put("The Godfather", "Francis Ford Coppola");

        // Display all elements
        System.out.println("Movie List:");
        System.out.println(movieDirectorDemo);

        // Use get() to display director of one specific movie
        System.out.println("Director of Inception: " + movieDirectorDemo.get("Inception"));

        // Use containsKey() to check whether a movie exists
        System.out.println("Does Titanic exist? " + movieDirectorDemo.containsKey("Titanic"));

        // Use containsKey() again to check a movie that does not exist
        System.out.println("Does Joker exist? " + movieDirectorDemo.containsKey("Joker"));

        // Update director of one movie using put()
        movieDirectorDemo.put("Avatar", "James Cameron Updated");

        // Display updated HashMap
        System.out.println("After updating director of Avatar:");
        System.out.println(movieDirectorDemo);

        // Remove one movie record
        movieDirectorDemo.remove("Interstellar");

        // Display HashMap after removal
        System.out.println("After removing Interstellar:");
        System.out.println(movieDirectorDemo);

        // Display total number of records left
        System.out.println("Total number of movies: " + movieDirectorDemo.size());
    }
}