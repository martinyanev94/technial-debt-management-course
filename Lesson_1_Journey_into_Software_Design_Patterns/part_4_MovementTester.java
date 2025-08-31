public static void testMovement(Movable movable) {
    movable.move();
}

public static void main(String[] args) {
    Movable myBicycle = new Bicycle();
    Movable myCar = new Car();

    testMovement(myBicycle); // Outputs: Bicycle is pedaling forward!
    testMovement(myCar);      // Outputs: Car speeds down the road!
}
