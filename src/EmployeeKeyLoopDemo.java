import java.util.HashMap;

public class EmployeeKeyLoopDemo {

    //  Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (Integer = ID, String = Name)
        HashMap<Integer, String> employeeKeyLoopDemo = new HashMap<>();

        // Add 5 employee records using put()
        employeeKeyLoopDemo.put(101, "Sultan");
        employeeKeyLoopDemo.put(102, "Mohanned");
        employeeKeyLoopDemo.put(103, "Safa");
        employeeKeyLoopDemo.put(104, "Fatima");
        employeeKeyLoopDemo.put(105, "Alanoud");

        // Display full HashMap
        System.out.println("Employee List:");
        System.out.println(employeeKeyLoopDemo);

        // Use keySet() and loop to display each record
        System.out.println("Employee Records:");

        for (Integer id : employeeKeyLoopDemo.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employeeKeyLoopDemo.get(id));
        }

        // Add one more employee record
        employeeKeyLoopDemo.put(106, "Ali");

        // Display updated records again using loop
        System.out.println("\nUpdated Employee Records:");

        for (Integer id : employeeKeyLoopDemo.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employeeKeyLoopDemo.get(id));
        }
    }
}