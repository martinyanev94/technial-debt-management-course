abstract class Vehicle {
    public abstract void drive();
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Driving a car.");
    }
}

class Truck extends Vehicle {
    public void drive() {
        System.out.println("Driving a truck.");
    }
}

abstract class VehicleFactory {
    public abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Car();
    }
}

class TruckFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Truck();
    }
}
