import java.util.HashMap;

public class EmployeeKeysValuesDemo {

    //  Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (Integer = ID, String = Name)
        HashMap<Integer, String> employeeKeysValuesDemo = new HashMap<>();

        // Add 5 employee using put()
        employeeKeysValuesDemo.put(101, "Sultan");
        employeeKeysValuesDemo.put(102, "Mohanned");
        employeeKeysValuesDemo.put(103, "Safa");
        employeeKeysValuesDemo.put(104, "Fatima");
        employeeKeysValuesDemo.put(105, "Alanoud");

        // Display all elements
        System.out.println("Employee List:");
        System.out.println(employeeKeysValuesDemo);

        // Display all employee IDs using keySet()
        System.out.println("Employee IDs:");
        System.out.println(employeeKeysValuesDemo.keySet());

        // Display all employee names using values()
        System.out.println("Employee Names:");
        System.out.println(employeeKeysValuesDemo.values());

        // Add one more employee record
        employeeKeysValuesDemo.put(106, "Ali");

        // Display updated keys
        System.out.println("Updated Employee IDs:");
        System.out.println(employeeKeysValuesDemo.keySet());

        // Display updated values
        System.out.println("Updated Employee Names:");
        System.out.println(employeeKeysValuesDemo.values());
    }
}