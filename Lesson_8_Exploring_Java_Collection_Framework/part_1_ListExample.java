import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(); // Creating an ArrayList

        fruits.add("Apple"); // Adding elements
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicates are fine in lists

        // Printing the fruits list
        System.out.println("Fruits List: " + fruits);
        
        // Accessing a fruit by index
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit);

        // Removing a fruit
        fruits.remove("Banana");
        System.out.println("Fruits after removal: " + fruits);
    }
}
