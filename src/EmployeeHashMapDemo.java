import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EmployeeHashMapDemo {
    public static void main(String[] args) {

        // Declare Set using HashSet
        HashMap<String,Integer> employeerecords = new HashMap<>();

        // Add 5 employee records using put()
        employeerecords.put("Ali", 111);
        employeerecords.put("Sara", 222);
        employeerecords.put("Omar", 333);
        employeerecords.put("Noor", 444);
        employeerecords.put("Maha", 555);

        // Display all employee records
        System.out.println("Employee Records:");
        System.out.println(employeerecords);

        // Add One more employee record
        employeerecords.put("Alanoud", 666);

        // Display updated HashMap
        System.out.println(employeerecords);
    }
}




