import java.util.HashMap;
import java.util.Map;

public class EmployeeIterateDemo {

    //  Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (Integer = ID, String = Name)
        HashMap<Integer, String> employeeIterateDemo = new HashMap<>();

        // Add 5 employee records using put()
        employeeIterateDemo.put(101, "Sultan");
        employeeIterateDemo.put(102, "Mohanned");
        employeeIterateDemo.put(103, "Safa");
        employeeIterateDemo.put(104, "Fatima");
        employeeIterateDemo.put(105, "Alanoud");

        // Display full HashMap
        System.out.println("Employee List:");
        System.out.println(employeeIterateDemo);

        // Use entrySet() with loop to display each record
        System.out.println("Employee Records:");

        for (Map.Entry<Integer, String> entry : employeeIterateDemo.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Add one more employee record
        employeeIterateDemo.put(106, "Ali");

        // Display updated records
        System.out.println("After adding new employee:");

        for (Map.Entry<Integer, String> entry : employeeIterateDemo.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}