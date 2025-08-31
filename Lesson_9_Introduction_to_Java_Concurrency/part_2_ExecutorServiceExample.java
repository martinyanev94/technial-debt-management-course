import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Executing task in thread: " + threadName);
        };

        executor.submit(task);
        executor.submit(task);
        executor.submit(task);
        
        executor.shutdown(); // Initiates an orderly shutdown
    }
}
