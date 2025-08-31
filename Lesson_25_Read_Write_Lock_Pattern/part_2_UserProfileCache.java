import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class UserProfileCache {
    private final ConcurrentHashMap<String, String> userCache = new ConcurrentHashMap<>();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public String getProfile(String userId) {
        lock.readLock().lock();
        try {
            return userCache.get(userId); // Read user profile
        } finally {
            lock.readLock().unlock();
        }
    }

    public void updateProfile(String userId, String profileData) {
        lock.writeLock().lock();
        try {
            userCache.put(userId, profileData); // Update profile in cache
        } finally {
            lock.writeLock().unlock();
        }
    }
}
