import java.util.HashMap;

public class ProductPriceDemo {

    // Main method
    public static void main(String[] args) {

        // Declare a HashMap variable (String = Product Name, Double = Price)
        HashMap<String, Double> productPriceDemo = new HashMap<>();

        // Add 5 product records using put()
        productPriceDemo.put("Laptop", 750.0);
        productPriceDemo.put("Phone", 500.0);
        productPriceDemo.put("Tablet", 300.0);
        productPriceDemo.put("Headphones", 80.0);
        productPriceDemo.put("Mouse", 25.0);

        // Display all elements
        System.out.println("Product List:");
        System.out.println(productPriceDemo);

        // Use get() to display price of one product
        System.out.println("Price of Phone: " + productPriceDemo.get("Phone"));

        // Use containsKey() to check whether product exists
        System.out.println("Does Laptop exist? " + productPriceDemo.containsKey("Laptop"));

        // Update price of one product using put()
        productPriceDemo.put("Phone", 550.0);

        // Display updated HashMap
        System.out.println("After updating price of Phone:");
        System.out.println(productPriceDemo);

        // Remove one product record
        productPriceDemo.remove("Tablet");

        // Display HashMap after removal
        System.out.println("After removing Tablet:");
        System.out.println(productPriceDemo);

        // Display total number of products left
        System.out.println("Total number of products: " + productPriceDemo.size());
    }
}