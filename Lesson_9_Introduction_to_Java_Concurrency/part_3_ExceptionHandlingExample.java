public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            throw new RuntimeException("Something went wrong!");
        });
        
        thread.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("Caught exception in thread " + t.getName() + ": " + e.getMessage());
        });
        
        thread.start();
    }
}
