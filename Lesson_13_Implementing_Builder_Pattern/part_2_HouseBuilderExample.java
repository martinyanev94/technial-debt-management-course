public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .setRooms(4)
                .setRoofType("Gable")
                .setColor("Blue")
                .build();

        System.out.println(house);
    }
}

java
public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .setRooms(4)
                .setRoofType("Gable")
                .setColor("Blue")
                .build();

        System.out.println(house);
    }
}


House{rooms=4, roofType='Gable', color='Blue'}

