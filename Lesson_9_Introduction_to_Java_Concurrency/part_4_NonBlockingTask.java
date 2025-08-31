class LongTask implements Runnable {
    public void run() {
        try {
            // Simulating a long task
            System.out.println("Long task started.");
            Thread.sleep(5000); // Sleep for 5 seconds
            System.out.println("Long task completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class NonBlockingTaskExample {
    public static void main(String[] args) {
        Thread longTaskThread = new Thread(new LongTask());
        longTaskThread.start();
        
        System.out.println("Main thread is free to do something else while the long task runs...");
    }
}
