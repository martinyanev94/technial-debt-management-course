public class Vehicle {
    public void describe() {
        System.out.println("This is a vehicle.");
    }
}

public class Car extends Vehicle {
    @Override
    public void describe() {
        System.out.println("This is a car.");
    }
}

public class Truck extends Vehicle {
    @Override
    public void describe() {
        System.out.println("This is a truck.");
    }
}
