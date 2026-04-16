import java.util.HashMap;

public class EmployeeGetDemo {
    public static void main(String[] args) {

        // Add HashMap
        HashMap<Integer, String> employees = new HashMap<>();

        // Add 5 Employee records using put()
        employees.put(000, "Said");
        employees.put(111, "Sara");
        employees.put(222, "Noor");
        employees.put(333, "Noof");
        employees.put(444, "Maha");

        // Display all employee records
        System.out.println("Employee Records:");
        System.out.println(employees);

        // Retrieve employee name using get() for a specific ID
        String name1 = employees.get(111);
        System.out.println("Employee with ID 111: " + name1);

        // Retrieve another employee name using get()
        String name2 = employees.get(444);
        System.out.println("Employee with ID 444: " + name2);
    }
}

