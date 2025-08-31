public class VehicleService {
    private Database database;

    public VehicleService(Database database) {
        this.database = database; // Over-reliance on a specific database technology
    }
    
    public void addVehicle(Vehicle vehicle) {
        database.save(vehicle);
    }
}
