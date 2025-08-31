abstract class Vehicle {
    public abstract void create();
}

class Car extends Vehicle {
    public void create() {
        System.out.println("Car created.");
    }
}

class Bike extends Vehicle {
    public void create() {
        System.out.println("Bike created.");
    }
}

class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }
}
