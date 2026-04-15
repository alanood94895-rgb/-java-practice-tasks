import java.util.HashMap;

public class DepartmentManagerDemo {

    // Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (String = Department Name, String = Manager Name)
        HashMap<String, String> departmentManagerDemo = new HashMap<>();

        // Add 5 department-manager records using put()
        departmentManagerDemo.put("HR", "Ahmed");
        departmentManagerDemo.put("IT", "Sara");
        departmentManagerDemo.put("Finance", "Omar");
        departmentManagerDemo.put("Marketing", "Mona");
        departmentManagerDemo.put("Sales", "Khalid");

        // Display all elements
        System.out.println("Department List:");
        System.out.println(departmentManagerDemo);

        // Use get() to display manager of one specific department
        System.out.println("Manager of IT: " + departmentManagerDemo.get("IT"));

        // Use containsKey() to check whether a department exists
        System.out.println("Does HR exist? " + departmentManagerDemo.containsKey("HR"));

        // Use containsKey() again to check a department that does not exist
        System.out.println("Does Legal exist? " + departmentManagerDemo.containsKey("Legal"));

        // Update manager of one department using put()
        departmentManagerDemo.put("IT", "Ali");

        // Display updated HashMap
        System.out.println("After updating manager of IT:");
        System.out.println(departmentManagerDemo);

        // Remove one department record
        departmentManagerDemo.remove("Finance");

        // Display HashMap after removal
        System.out.println("After removing Finance:");
        System.out.println(departmentManagerDemo);

        // Display total number of records left
        System.out.println("Total number of departments: " + departmentManagerDemo.size());
    }
}