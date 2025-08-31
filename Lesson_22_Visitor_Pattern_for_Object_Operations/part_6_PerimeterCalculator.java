class PerimeterCalculator implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Perimeter of Circle: " + perimeter);
    }

    @Override
    public void visit(Square square) {
        double perimeter = 4 * square.getSide();
        System.out.println("Perimeter of Square: " + perimeter);
    }

    @Override
    public void visit(Triangle triangle) {
        // Assume we have the other two sides for simplicity; just a static example here!
        double perimeter = triangle.getBase() + triangle.getHeight() + 5; // this is arbitrary
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}
