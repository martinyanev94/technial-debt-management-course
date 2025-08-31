public class GarbageCollectionExample {
    public static void main(String[] args) {
        GarbageCollectionExample obj = new GarbageCollectionExample();
        obj = null; // eligible for garbage collection
        System.gc(); // suggesting the GC to run
    }
}
