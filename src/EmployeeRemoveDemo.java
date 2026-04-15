import java.util.HashMap;

public class EmployeeRemoveDemo {
    // Main method
    public static void main(String[] args) {
        //  Declare a HashMap variable
        HashMap<String, Integer> EmployeeRemoveDemo = new HashMap<>();
        // Add 5 employee records using put()
        EmployeeRemoveDemo.put("Sultan", 111);
        EmployeeRemoveDemo.put("Mohanned", 222);
        EmployeeRemoveDemo.put("safa", 333);
        EmployeeRemoveDemo.put("Fatima", 444);
        EmployeeRemoveDemo.put("Alanoud", 555);

        //Display all elements
        System.out.println(EmployeeRemoveDemo);

        //Remove one employee using ID
        EmployeeRemoveDemo.remove(333);

        //Display after removal
        System.out.println(EmployeeRemoveDemo);
        //  Attempt to remove non-existing ID
        String removedEmployee = String.valueOf(EmployeeRemoveDemo.remove(999));

        if (removedEmployee == null) {
            System.out.println("No employee found with ID 999.");
        }
        // Display final HashMap
        System.out.println("Final EmployeeRemoveDemo List:");
        System.out.println(EmployeeRemoveDemo);
    }
}


