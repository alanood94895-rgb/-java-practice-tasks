import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EmployeeHashMapDemo {
    public static void main(String[] args) {

        // Declare Set using HashSet
        HashMap<String,Integer> employeerecords = new HashMap<>();

        // Add 5 employee records using put()
        employeerecords.put(111, "Ali");
        employeerecords.put(222, "Sara");
        employeerecords.put(333, "Omar");
        employeerecords.put(444, "Noor");
        employeerecords.put(555, "Maha");

        // Display all employee records
        System.out.println("Employee Records:");
        System.out.println(employeerecords);

        // Add one more employee record
        employeerecords.put(666, "Alanoud");

        // Display updated HashMap
        System.out.println(employeerecords);
    }
}




