import java.util.ArrayList;
import java.util.List;

class GraphicGroup implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void display() {
        for (Graphic graphic : graphics) {
            graphic.display();
        }
    }
}
