import java.util.HashMap;

public class EmployeeMapDemo {

    // Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (Integer = Employee ID, String = Employee Name)
        HashMap<Integer, String> employeeMapDemo = new HashMap<>();

        // Add 5 employee records using put()
        employeeMapDemo.put(101, "Sultan");
        employeeMapDemo.put(102, "Mohanned");
        employeeMapDemo.put(103, "Safa");
        employeeMapDemo.put(104, "Fatima");
        employeeMapDemo.put(105, "Alanoud");

        // Display all elements
        System.out.println("Employee List:");
        System.out.println(employeeMapDemo);

        // Use get() to display name of one specific employee using ID
        System.out.println("Employee with ID 103: " + employeeMapDemo.get(103));

        // Use containsKey() to check whether one employee ID exists
        System.out.println("Does ID 104 exist? " + employeeMapDemo.containsKey(104));

        // Use containsKey() again to check a non-existing ID
        System.out.println("Does ID 999 exist? " + employeeMapDemo.containsKey(999));

        // Update the name of one employee using put()
        employeeMapDemo.put(103, "Safa");

        // Display updated HashMap
        System.out.println("After updating employee ID 103:");
        System.out.println(employeeMapDemo);

        // Remove one employee record
        employeeMapDemo.remove(102);

        // Display HashMap after removal
        System.out.println("After removing employee ID 102:");
        System.out.println(employeeMapDemo);

        // Display total number of records left
        System.out.println("Total number of employees: " + employeeMapDemo.size());
    }
}