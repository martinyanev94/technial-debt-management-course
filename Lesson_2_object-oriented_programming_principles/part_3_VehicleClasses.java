public class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting.");
    }
}

public class Car extends Vehicle {
    public void honk() {
        System.out.println("Car is honking.");
    }
}

public class Truck extends Vehicle {
    public void load() {
        System.out.println("Truck is loading cargo.");
    }
}
