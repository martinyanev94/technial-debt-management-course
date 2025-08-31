import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>(); // Creating a HashSet

        colors.add("Red"); 
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red"); // Trying to add a duplicate

        // Print the colors set
        System.out.println("Colors Set: " + colors); // Will only show unique colors

        // Checking if a color exists
        boolean hasBlue = colors.contains("Blue");
        System.out.println("Contains Blue: " + hasBlue);
    }
}
