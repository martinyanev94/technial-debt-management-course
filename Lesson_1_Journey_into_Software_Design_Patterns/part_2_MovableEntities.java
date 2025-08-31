public interface Movable {
    void move();
}

public class Bicycle implements Movable {
    @Override
    public void move() {
        System.out.println("Bicycle is pedaling forward!");
    }
}

public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Car speeds down the road!");
    }
}
