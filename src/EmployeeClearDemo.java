import java.util.HashMap;

public class EmployeeClearDemo {

    // Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (Integer = ID, String = Name)
        HashMap<Integer, String> EmployeeClearDemo = new HashMap<>();

        // Add 5 employee records using put()
        EmployeeClearDemo.put(101, "Sultan");
        EmployeeClearDemo.put(102, "Mohanned");
        EmployeeClearDemo.put(103, "Safa");
        EmployeeClearDemo.put(104, "Fatima");
        EmployeeClearDemo.put(105, "Alanoud");

        // Display all elements
        System.out.println("Employee List:");
        System.out.println(EmployeeClearDemo);

        // Display size before clearing
        System.out.println("Number of employees before clearing: " + EmployeeClearDemo.size());

        // Clear all elements from the HashMap
        EmployeeClearDemo.clear();

        // Display HashMap after clearing
        System.out.println("After clearing the HashMap:");
        System.out.println(EmployeeClearDemo);

        // Confirm size is 0
        System.out.println("Number of employees after clearing: " + EmployeeClearDemo.size());

        // Print confirmation message
        System.out.println("All employee records have been removed successfully.");
    }
}
