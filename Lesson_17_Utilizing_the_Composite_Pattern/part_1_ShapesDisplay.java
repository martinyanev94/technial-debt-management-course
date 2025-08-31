interface Graphic {
    void display();
}
class Circle implements Graphic {
    @Override
    public void display() {
        System.out.println("Displaying a circle.");
    }
}

class Square implements Graphic {
    @Override
    public void display() {
        System.out.println("Displaying a square.");
    }
}
