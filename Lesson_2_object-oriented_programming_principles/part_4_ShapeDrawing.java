public class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape myShape;

        myShape = new Circle();
        myShape.draw(); // Outputs: Drawing a circle.

        myShape = new Square();
        myShape.draw(); // Outputs: Drawing a square.
    }
}
