import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo {
    static List<String> leakedList = new ArrayList<>();

    public static void main(String[] args) {
        createLeakedObjects();
        // Memory leaks can occur if we don't clear the list
    }

    static void createLeakedObjects() {
        for (int i = 0; i < 1000; i++) {
            leakedList.add("Object " + i); // Forgetting to clear the list leads to memory leaks
        }
    }
}
