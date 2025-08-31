import java.util.concurrent.locks.ReentrantLock;

class BankAccountWithLock {
    private int balance = 1000;
    private final ReentrantLock lock = new ReentrantLock();

    public void withdraw(int amount) {
        lock.lock(); // Locking the current thread
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + ", new balance: " + balance);
            } else {
                System.out.println("Insufficient funds for withdrawal of " + amount);
            }
        } finally {
            lock.unlock(); // Making sure to unlock in case of exceptions
        }
    }
}

public class BankWithLockExample {
    public static void main(String[] args) {
        BankAccountWithLock account = new BankAccountWithLock();
        
        Runnable task = () -> {
            account.withdraw(600);
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
