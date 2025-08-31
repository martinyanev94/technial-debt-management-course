import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>(); // Creating a HashMap

        // Adding items to the map
        stock.put("Apple", 50);
        stock.put("Banana", 30);
        stock.put("Cherry", 20);

        // Displaying the stock map
        System.out.println("Stock: " + stock);

        // Accessing an item
        int appleStock = stock.get("Apple");
        System.out.println("Apple Stock: " + appleStock);

        // Removing an item
        stock.remove("Banana");
        System.out.println("Updated Stock after removal: " + stock);
    }
}
