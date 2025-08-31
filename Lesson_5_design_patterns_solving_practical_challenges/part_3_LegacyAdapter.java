public interface NewSystem {
    void request();
}

public class LegacySystem {
    public void legacyRequest() {
        System.out.println("Request from Legacy System");
    }
}

public class LegacyAdapter implements NewSystem {
    private LegacySystem legacySystem;

    public LegacyAdapter(LegacySystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public void request() {
        legacySystem.legacyRequest();
    }
}
