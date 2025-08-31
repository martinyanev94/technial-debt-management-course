class FuelChecker {
    public void checkFuelLevel(int fuel) {
        if (fuel < 10) {
            System.out.println("Fuel is low!");
        } else {
            System.out.println("Fuel level is sufficient.");
        }
    }
}

class TirePressureChecker {
    public void checkTirePressure(int pressure) {
        if (pressure < 30) {
            System.out.println("Tire pressure is low!");
        } else {
            System.out.println("Tire pressure is sufficient.");
        }
    }
}

// Repeated logic emerges.
class EngineChecker {
    public void checkEngine(int engineHealth) {
        if (engineHealth < 5) {
            System.out.println("Engine health is critical!");
        } else {
            System.out.println("Engine is in good condition.");
        }
    }
}
class VehicleUtility {
    public static void checkHealth(String type, int value, int threshold) {
        if (value < threshold) {
            System.out.println(type + " is low!");
        } else {
            System.out.println(type + " level is sufficient.");
        }
    }
}

class FuelChecker {
    public void checkFuelLevel(int fuel) {
        VehicleUtility.checkHealth("Fuel", fuel, 10);
    }
}

class TirePressureChecker {
    public void checkTirePressure(int pressure) {
        VehicleUtility.checkHealth("Tire Pressure", pressure, 30);
    }
}

class EngineChecker {
    public void checkEngine(int engineHealth) {
        VehicleUtility.checkHealth("Engine Health", engineHealth, 5);
    }
}
