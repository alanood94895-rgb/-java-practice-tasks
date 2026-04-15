import java.util.HashMap;

public class CourseTrainerDemo {

    // Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (String = Course Name, String = Trainer Name)
        HashMap<String, String> courseTrainerDemo = new HashMap<>();

        // Add 5 course-trainer records using put()
        courseTrainerDemo.put("Java Basics", "Ahmed");
        courseTrainerDemo.put("Python Basics", "Sara");
        courseTrainerDemo.put("Web Development", "Omar");
        courseTrainerDemo.put("Database Systems", "Mona");
        courseTrainerDemo.put("Mobile Apps", "Khalid");

        // Display all elements
        System.out.println("Course List:");
        System.out.println(courseTrainerDemo);

        // Use get() to display trainer of one specific course
        System.out.println("Trainer of Java Basics: " + courseTrainerDemo.get("Java Basics"));

        // Use containsKey() to check whether a course exists
        System.out.println("Does Python Basics exist? " + courseTrainerDemo.containsKey("Python Basics"));

        // Use containsKey() again to check a course that does not exist
        System.out.println("Does AI Course exist? " + courseTrainerDemo.containsKey("AI Course"));

        // Update trainer of one course using put()
        courseTrainerDemo.put("Web Development", "Ali");

        // Display updated HashMap
        System.out.println("After updating trainer of Web Development:");
        System.out.println(courseTrainerDemo);

        // Remove one course record
        courseTrainerDemo.remove("Database Systems");

        // Display HashMap after removal
        System.out.println("After removing Database Systems:");
        System.out.println(courseTrainerDemo);

        // Display total number of records left
        System.out.println("Total number of courses: " + courseTrainerDemo.size());
    }
}