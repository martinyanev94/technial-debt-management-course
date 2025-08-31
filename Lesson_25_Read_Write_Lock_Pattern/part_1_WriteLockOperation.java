public void write(int newData) {
    boolean acquired = false;
    try {
        acquired = lock.writeLock().tryLock(1000, TimeUnit.MILLISECONDS); // Wait for a second
        if (acquired) {
            sharedData = newData; // Writing data
        } else {
            System.out.println("Write lock not acquired. Try again later.");
        }
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        System.out.println("Write operation was interrupted.");
    } finally {
        if (acquired) {
            lock.writeLock().unlock();
        }
    }
}
