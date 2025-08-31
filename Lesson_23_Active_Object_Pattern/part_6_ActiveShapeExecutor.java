import java.util.concurrent.Semaphore;

public class ActiveShape {
    private final BlockingQueue<Runnable> methodQueue;
    private final Thread controlThread;
    private final Semaphore semaphore;

    public ActiveShape(int maxConcurrentProcesses) {
        methodQueue = new LinkedBlockingQueue<>();
        semaphore = new Semaphore(maxConcurrentProcesses);
        controlThread = new Thread(() -> {
            while (true) {
                try {
                    Runnable methodCall = methodQueue.take();
                    semaphore.acquire(); // Acquire a permit before processing
                    new Thread(() -> {
                        try {
                            methodCall.run();
                        } catch (Exception e) {
                            System.err.println("Error during processing: " + e.getMessage());
                        } finally {
                            semaphore.release(); // Release the permit after processing
                        }
                    }).start();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
        controlThread.start();
    }
}
