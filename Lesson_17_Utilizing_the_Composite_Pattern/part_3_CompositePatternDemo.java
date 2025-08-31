public class CompositePatternDemo {
    public static void main(String[] args) {
        Graphic circle = new Circle();
        Graphic square = new Square();

        GraphicGroup group1 = new GraphicGroup();
        group1.add(circle);
        group1.add(square);

        GraphicGroup mainGroup = new GraphicGroup();
        mainGroup.add(group1);
        mainGroup.add(new Circle()); // A separate circle added directly to mainGroup

        mainGroup.display(); // Displays all shapes, including those in the group
    }
}
