public interface Delivery {
    void deliver();
}
public class TruckDelivery implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck!");
    }
}

public class ShipDelivery implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Delivering by ship!");
    }
}
public abstract class DeliveryFactory {
    public abstract Delivery createDelivery();
}
public class TruckDeliveryFactory extends DeliveryFactory {
    @Override
    public Delivery createDelivery() {
        return new TruckDelivery();
    }
}

public class ShipDeliveryFactory extends DeliveryFactory {
    @Override
    public Delivery createDelivery() {
        return new ShipDelivery();
    }
}
