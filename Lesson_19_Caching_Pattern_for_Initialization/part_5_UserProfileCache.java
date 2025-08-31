import java.util.HashMap;

class UserProfile {
    private String username;
    private String email;

    public UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // getters here...
}

class UserProfileCache {
    private HashMap<String, UserProfile> cache = new HashMap<>();

    public UserProfile getUserProfile(String username, String email) {
        String key = username + "-" + email;
        if (!cache.containsKey(key)) {
            UserProfile newProfile = new UserProfile(username, email);
            cache.put(key, newProfile);
            return newProfile;
        }
        return cache.get(key);
    }
}
