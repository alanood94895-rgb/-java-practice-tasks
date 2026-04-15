import java.util.HashMap;

public class EmployeeEmptyDemo {

    //  Main method
    public static void main(String[] args) {

        // Declare a HashMap variable
        HashMap<Integer, String> employeeEmptyDemo = new HashMap<>();

        // Check if HashMap is empty before adding records
        System.out.println("Is the HashMap empty before adding records " + employeeEmptyDemo.isEmpty());

        // Add 5 employee records using put()
        employeeEmptyDemo.put(101, "Sultan");
        employeeEmptyDemo.put(102, "Mohanned");
        employeeEmptyDemo.put(103, "Safa");
        employeeEmptyDemo.put(104, "Fatima");
        employeeEmptyDemo.put(105, "Alanoud");

        // Display all elements
        System.out.println("Employee List:");
        System.out.println(employeeEmptyDemo);

        // Check if HashMap is empty after adding records
        System.out.println("Is the HashMap empty after adding records " + employeeEmptyDemo.isEmpty());

        // Clear all employee records
        employeeEmptyDemo.clear();

        // Display HashMap after clearing
        System.out.println("After clearing the HashMap:");
        System.out.println(employeeEmptyDemo);

        // Final check if HashMap is empty
        System.out.println("Is the HashMap empty after clearing" + employeeEmptyDemo.isEmpty());
    }
}