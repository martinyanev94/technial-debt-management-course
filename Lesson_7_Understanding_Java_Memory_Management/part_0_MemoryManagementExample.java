public class MemoryManagementExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}

class MyClass {
    void display() {
        System.out.println("Object created in heap memory");
    }
}
