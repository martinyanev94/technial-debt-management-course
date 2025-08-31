import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ActiveShape {
    private final BlockingQueue<Runnable> methodQueue;
    private final Thread controlThread;

    public ActiveShape() {
        methodQueue = new LinkedBlockingQueue<>();
        controlThread = new Thread(() -> {
            while (true) {
                try {
                    Runnable methodCall = methodQueue.take();
                    methodCall.run(); // Execute the method call
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break; // Exit the thread if interrupted
                }
            }
        });
        controlThread.start(); // Start the control thread
    }

    public void drawShape(final String shape) {
        methodQueue.offer(() -> System.out.println("Drawing a " + shape));
    }

    public void close() {
        controlThread.interrupt(); // Stop the active object
    }
}
