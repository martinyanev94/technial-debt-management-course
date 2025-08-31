import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private int sharedData;

    public int read() {
        lock.readLock().lock();
        try {
            return sharedData; // Reading data
        } finally {
            lock.readLock().unlock();
        }
    }

    public void write(int newData) {
        lock.writeLock().lock();
        try {
            sharedData = newData; // Writing data
        } finally {
            lock.writeLock().unlock();
        }
    }
}
