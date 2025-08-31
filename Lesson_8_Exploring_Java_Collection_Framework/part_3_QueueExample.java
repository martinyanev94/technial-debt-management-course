import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>(); // Creating a queue

        q.offer("First");
        q.offer("Second");
        q.offer("Third");

        // Displaying elements in the queue
        System.out.println("Queue: " + q);

        // Removing elements
        String firstElement = q.poll();
        System.out.println("Removed: " + firstElement);
        System.out.println("Queue after removal: " + q);
    }
}
