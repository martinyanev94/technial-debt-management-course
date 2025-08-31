interface Vehicle {
    void drive();
}

abstract class Terrain {
    protected Vehicle vehicle;

    protected Terrain(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    abstract void driveOnTerrain();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving.");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Bike is riding.");
    }
}

class OffRoad extends Terrain {
    public OffRoad(Vehicle vehicle) {
        super(vehicle);
    }

    void driveOnTerrain() {
        System.out.print("Driving off-road: ");
        vehicle.drive();
    }
}

class Highway extends Terrain {
    public Highway(Vehicle vehicle) {
        super(vehicle);
    }

    void driveOnTerrain() {
        System.out.print("Driving on highway: ");
        vehicle.drive();
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Terrain offRoadCar = new OffRoad(car);
        offRoadCar.driveOnTerrain();

        Vehicle bike = new Bike();
        Terrain highwayBike = new Highway(bike);
        highwayBike.driveOnTerrain();
    }
}
