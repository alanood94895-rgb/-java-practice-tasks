import java.util.HashMap;

public class EmployeeUpdateDemo {

    //  Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (Integer = ID, String = Name)
        HashMap<Integer, String> employeeUpdateDemo = new HashMap<>();

        // Add  5 employee records using put()
        employeeUpdateDemo.put(101, "Sultan");
        employeeUpdateDemo.put(102, "Mohanned");
        employeeUpdateDemo.put(103, "Safa");
        employeeUpdateDemo.put(104, "Fatima");
        employeeUpdateDemo.put(105, "Alanoud");

        // Display all elements
        System.out.println("Initial Employee List:");
        System.out.println(employeeUpdateDemo);

        //  Update the name of an existing employee
        employeeUpdateDemo.put(103, "Safa");  // Updated name

        //  Display the updated HashMap
        System.out.println("After updating employee with ID 103:");
        System.out.println(employeeUpdateDemo);

        //  Use get() to show updated value
        System.out.println("Updated name for ID 103: " + employeeUpdateDemo.get(103));

        //  Update another employee record
        employeeUpdateDemo.put(101, "Sultan Ahmed");

        //  Display map after second update
        System.out.println("After updating employee with ID 101:");
        System.out.println(employeeUpdateDemo);
    }
}