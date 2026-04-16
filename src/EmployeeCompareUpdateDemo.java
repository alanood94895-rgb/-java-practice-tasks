import java.util.HashMap;

public class EmployeeCompareUpdateDemo {

    //  Main method
    public static void main(String[] args) {

        // Declare a HashMap variable
        HashMap<Integer, String> employeeCompareUpdateDemo = new HashMap<>();

        // Add 5 employee records using put()
        employeeCompareUpdateDemo.put(101, "Sultan");
        employeeCompareUpdateDemo.put(102, "Mohanned");
        employeeCompareUpdateDemo.put(103, "Safa");
        employeeCompareUpdateDemo.put(104, "Fatima");
        employeeCompareUpdateDemo.put(105, "Alanoud");

        // Display all elements
        System.out.println("Employee List:");
        System.out.println(employeeCompareUpdateDemo);

        // Use get() to display current value of one employee ID
        System.out.println("Current name for ID 103: " + employeeCompareUpdateDemo.get(103));

        // Update that employee name using put()
        employeeCompareUpdateDemo.put(103, "Safa");

        // Use get() again to show updated value
        System.out.println("Updated name for ID 103: " + employeeCompareUpdateDemo.get(103));

        // Repeat same process for another employee ID
        System.out.println("Current name for ID 101: " + employeeCompareUpdateDemo.get(101));

        employeeCompareUpdateDemo.put(101, "Sultan ");

        System.out.println("Updated name for ID 101: " + employeeCompareUpdateDemo.get(101));

        // Display full HashMap after updates
        System.out.println("Updated Employee List:");
        System.out.println(employeeCompareUpdateDemo);
    }
}