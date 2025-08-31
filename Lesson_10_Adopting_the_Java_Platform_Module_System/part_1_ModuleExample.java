// file: module-info.java
module module.example {
    exports example;
}

// file: ExampleMain.java
package example;

public class ExampleMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Platform Module System!");
    }
}
