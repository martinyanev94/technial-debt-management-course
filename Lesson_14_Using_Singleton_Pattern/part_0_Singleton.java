public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Constructor is private
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
