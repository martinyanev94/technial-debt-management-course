public class Vehicle {
    private boolean moving;

    public void move() {
        this.moving = true;
        System.out.println("Vehicle is now moving.");
    }

    public void stop() {
        this.moving = false;
        System.out.println("Vehicle has stopped.");
    }

    public boolean isMoving() {
        return moving;
    }
}
