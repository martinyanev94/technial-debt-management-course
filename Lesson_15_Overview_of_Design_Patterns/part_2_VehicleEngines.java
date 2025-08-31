interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol engine starting...");
    }
}

class ElectricEngine {
    public void charge() {
        System.out.println("Charging electric engine...");
    }
}

class ElectricEngineAdapter implements Engine {
    private ElectricEngine electricEngine;

    public ElectricEngineAdapter(ElectricEngine electricEngine) {
        this.electricEngine = electricEngine;
    }

    public void start() {
        electricEngine.charge();
        System.out.println("Electric engine starting...");
    }
}

public class Vehicle {
    private Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public static void main(String[] args) {
        Vehicle petrolVehicle = new Vehicle(new PetrolEngine());
        petrolVehicle.start();

        ElectricEngine electricEngine = new ElectricEngine();
        Vehicle electricVehicle = new Vehicle(new ElectricEngineAdapter(electricEngine));
        electricVehicle.start();
    }
}
