public interface Vehicle {
    void drive();
    void sail();
}

public class Car implements Vehicle {
    public void drive() {
        // Driving logic
    }

    public void sail() {
        throw new UnsupportedOperationException("Cars cannot sail");
    }
}

public class Boat implements Vehicle {
    public void drive() {
        throw new UnsupportedOperationException("Boats cannot drive");
    }

    public void sail() {
        // Sailing logic
    }
}
public interface LandVehicle {
    void drive();
}

public interface WaterVehicle {
    void sail();
}

public class Car implements LandVehicle {
    public void drive() {
        // Driving logic
    }
}

public class Boat implements WaterVehicle {
    public void sail() {
        // Sailing logic
    }
}
