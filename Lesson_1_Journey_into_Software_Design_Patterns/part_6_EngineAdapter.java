public interface Engine {
    void start();
}

public class SimpleEngine implements Engine {
    public void start() {
        System.out.println("Simple Engine starting!");
    }
}

public class V8Engine {
    public void ignite() {
        System.out.println("V8 Engine igniting!");
    }
}

public class V8EngineAdapter implements Engine {
    private V8Engine v8Engine;

    public V8EngineAdapter(V8Engine v8Engine) {
        this.v8Engine = v8Engine;
    }

    public void start() {
        v8Engine.ignite();
    }
}
