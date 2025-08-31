public class GarbageCollectionDemo {
    public static void main(String[] args) {
        GarbageCollectionDemo demo = new GarbageCollectionDemo();
        demo.createObjects();
        
        // Suggesting the JVM to perform garbage collection
        System.gc();
        System.out.println("Garbage collection suggested.");
    }
    
    void createObjects() {
        for (int i = 0; i < 10000; i++) {
            String temp = "Temporary String " + i; // This string is eligible for GC after this method completes
        }
    }
}
