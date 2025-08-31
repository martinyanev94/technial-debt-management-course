public class House {
    private final int rooms;
    private final String roofType;
    private final String color;

    private House(HouseBuilder builder) {
        this.rooms = builder.rooms;
        this.roofType = builder.roofType;
        this.color = builder.color;
    }

    public static class HouseBuilder {
        private int rooms;
        private String roofType;
        private String color;

        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public HouseBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", roofType='" + roofType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
