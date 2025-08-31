public class HouseBuilder {
    private int rooms;
    private String roofType;
    private String color;
    private boolean hasGarage;
    private boolean hasPatio;

    // Previous setter methods...

    public HouseBuilder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HouseBuilder setHasPatio(boolean hasPatio) {
        this.hasPatio = hasPatio;
        return this;
    }

    public House build() {
        // Validation logic...
        return new House(this);
    }
}
public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .setRooms(3)
                .setRoofType("Hip")
                .setColor("Green")
                .setHasGarage(true)
                .setHasPatio(false)
                .build();

        System.out.println(house);
    }
}
