import java.util.HashMap;

public class EmployeeCheckDemo {
    public static void main(String[] args) {

        // Display HashMap
        HashMap<Integer, String> employees = new HashMap<>();

        // Add 5 employee records
        employees.put(110, "Abdullah");
        employees.put(220, "Mayar");
        employees.put(330, "Mayas");
        employees.put(440, "Bayan");
        employees.put(550, "Muna");

        // Display all employee records
        System.out.println("Employee Records:");
        System.out.println(employees);

        // Check if a specific key (employee ID) exists
        System.out.println("Checking if ID 110 exists:");
        System.out.println("Result: " + employees.containsKey(110));

        // Check another ID that does not exist
        System.out.println("Checking if ID 770 exists:");
        System.out.println("Result: " + employees.containsKey(770));

        // Check if a specific value (employee name) exists
        System.out.println("Checking if 'Mayar' exists:");
        System.out.println("Result: " + employees.containsValue("Mayar"));

        // Check another Name that does not exist
        System.out.println("Checking if 'Muna' exists:");
        System.out.println("Result: " + employees.containsValue("Muna"));
    }
}


