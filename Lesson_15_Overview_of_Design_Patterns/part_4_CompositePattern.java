import java.util.ArrayList;
import java.util.List;

interface Component {
    void display();
}

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Leaf: " + name);
    }
}

class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void display() {
        for (Component child : children) {
            child.display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Composite root = new Composite();
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        root.add(leaf1);
        root.add(leaf2);

        root.display();
    }
}
