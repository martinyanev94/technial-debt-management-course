class VolatileDemo {
    private volatile boolean flag = false;

    public void writer() {
        flag = true; // Writing to the variable
    }

    public void reader() {
        if (flag) { // Reading the variable
            System.out.println("Flag has been set to true!");
        }
    }
}

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        VolatileDemo demo = new VolatileDemo();
        Thread writerThread = new Thread(demo::writer);
        Thread readerThread = new Thread(demo::reader);

        readerThread.start();
        writerThread.start();
        writerThread.join();
        readerThread.join();
    }
}
