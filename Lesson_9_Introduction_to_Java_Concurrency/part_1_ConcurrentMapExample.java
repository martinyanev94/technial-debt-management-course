import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        
        Runnable putTask = () -> {
            for (int i = 0; i < 5; i++) {
                map.put(Thread.currentThread().getName() + "-Key" + i, i);
            }
        };

        Thread t1 = new Thread(putTask);
        Thread t2 = new Thread(putTask);

        t1.start();
        t2.start();

        // Give threads some time to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Concurrent Map: " + map);
    }
}
