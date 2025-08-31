public class DroneDelivery implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivering by drone!");
    }
}
public class DroneDeliveryFactory extends DeliveryFactory {
    @Override
    public Delivery createDelivery() {
        return new DroneDelivery();
    }
}
public class Main {
    public static void main(String[] args) {
        DeliveryFactory truckFactory = new TruckDeliveryFactory();
        Delivery truckDelivery = truckFactory.createDelivery();
        truckDelivery.deliver();

        DeliveryFactory shipFactory = new ShipDeliveryFactory();
        Delivery shipDelivery = shipFactory.createDelivery();
        shipDelivery.deliver();

        DeliveryFactory droneFactory = new DroneDeliveryFactory();
        Delivery droneDelivery = droneFactory.createDelivery();
        droneDelivery.deliver();
    }
}
Delivering by ship!
Delivering by drone!
