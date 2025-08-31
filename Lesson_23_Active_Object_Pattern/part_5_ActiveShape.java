public class ActiveShape {
    // previous code...

    public ActiveShape() {
        methodQueue = new LinkedBlockingQueue<>();
        controlThread = new Thread(() -> {
            while (true) {
                try {
                    Runnable methodCall = methodQueue.take();
                    try {
                        methodCall.run(); // Attempt to execute the method call
                    } catch (Exception e) {
                        System.err.println("Error occurred during processing: " + e.getMessage());
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break; // Exit thread if interrupted
                }
            }
        });
        controlThread.start();
    }
}
