public class ShapeDrawer {
    public void drawCircle() {
        // Drawing logic for Circle
    }

    public void drawRectangle() {
        // Drawing logic for Rectangle
    }
}
public interface Shape {
    void draw();
}

public class Circle implements Shape {
    public void draw() {
        // Drawing logic for Circle
    }
}

public class Rectangle implements Shape {
    public void draw() {
        // Drawing logic for Rectangle
    }
}

public class ShapeDrawer {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}
