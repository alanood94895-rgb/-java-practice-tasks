import java.util.HashMap;

public class CountryCapitalDemo {

    // Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (String = Country, String = Capital)
        HashMap<String, String> countryCapitalDemo = new HashMap<>();

        // Add 5 country-capital records using put()
        countryCapitalDemo.put("Oman", "Muscat");
        countryCapitalDemo.put("UAE", "Abu Dhabi");
        countryCapitalDemo.put("Saudi Arabia", "Riyadh");
        countryCapitalDemo.put("Qatar", "Doha");
        countryCapitalDemo.put("Kuwait", "Kuwait City");

        // Display all elements
        System.out.println("Country List:");
        System.out.println(countryCapitalDemo);

        // Use get() to display capital of one country
        System.out.println("Capital of Oman: " + countryCapitalDemo.get("Oman"));

        // Use containsKey() to check whether country exists
        System.out.println("Does UAE exist? " + countryCapitalDemo.containsKey("UAE"));

        // Update capital of one country using put()
        countryCapitalDemo.put("Qatar", "New Doha");

        // Display updated HashMap
        System.out.println("After updating capital of Qatar:");
        System.out.println(countryCapitalDemo);

        // Remove one country record
        countryCapitalDemo.remove("Kuwait");

        // Display HashMap after removal
        System.out.println("After removing Kuwait:");
        System.out.println(countryCapitalDemo);

        // Display total number of records left
        System.out.println("Total number of countries: " + countryCapitalDemo.size());
    }
}