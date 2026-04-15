import java.util.HashMap;

public class EmployeeSizeDemo {
          //Main method
    public static void main(String[] args) {
        //  Declare a HashMap variable
        HashMap<String, Integer> EmployeeSizeDemo = new HashMap<>();

        // Add 5 employee records using put()
        EmployeeSizeDemo.put("Sultan", 101);
        EmployeeSizeDemo.put("Mohanned", 102);
        EmployeeSizeDemo.put("Safa", 103);
        EmployeeSizeDemo.put("Fatima", 104);
        EmployeeSizeDemo.put("Alanoud", 105);

        // Display all elements in the HashMap
        System.out.println(EmployeeSizeDemo);

        // Use size() to display total number of records
        System.out.println("Total number of employees: " + EmployeeSizeDemo.size());

        //  Add one more employee record
        EmployeeSizeDemo.put("Ali", 106);

        //  Display updated HashMap
        System.out.println("After adding one more employee:");
        System.out.println(EmployeeSizeDemo);

        //  Use size() again to display new total
        System.out.println("Updated total number of employees: " + EmployeeSizeDemo.size());
    }

}
