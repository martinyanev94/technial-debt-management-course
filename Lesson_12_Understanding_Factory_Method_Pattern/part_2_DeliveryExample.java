public class Main {
    public static void main(String[] args) {
        DeliveryFactory truckFactory = new TruckDeliveryFactory();
        Delivery truckDelivery = truckFactory.createDelivery();
        truckDelivery.deliver();

        DeliveryFactory shipFactory = new ShipDeliveryFactory();
        Delivery shipDelivery = shipFactory.createDelivery();
        shipDelivery.deliver();
    }
}
Delivering by ship!
