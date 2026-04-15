import java.util.HashMap;

public class StudentMarksDemo {

    // Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (Integer = ID, Integer = Mark)
        HashMap<Integer, Integer> studentMarksDemo = new HashMap<>();

        // Add 5 student records using put()
        studentMarksDemo.put(101, 85);
        studentMarksDemo.put(102, 90);
        studentMarksDemo.put(103, 75);
        studentMarksDemo.put(104, 88);
        studentMarksDemo.put(105, 92);

        // Display all elements
        System.out.println("Student List:");
        System.out.println(studentMarksDemo);

        // Use get() to display mark of one student
        System.out.println("Mark of student ID 103: " + studentMarksDemo.get(103));

        // Use containsKey() to check whether student ID exists
        System.out.println("Does student ID 104 exist? " + studentMarksDemo.containsKey(104));

        // Update mark of one student using put()
        studentMarksDemo.put(103, 80);

        // Display updated HashMap
        System.out.println("After updating mark of student ID 103:");
        System.out.println(studentMarksDemo);

        // Remove one student record
        studentMarksDemo.remove(102);

        // Display HashMap after removal
        System.out.println("After removing student ID 102:");
        System.out.println(studentMarksDemo);

        // Display total number of records
        System.out.println("Total number of students: " + studentMarksDemo.size());
    }
}