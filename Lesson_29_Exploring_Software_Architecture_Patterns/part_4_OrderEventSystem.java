// Event interface
interface Event {
    String getName();
}

// Order Placed Event
class OrderPlacedEvent implements Event {
    private String orderId;

    public OrderPlacedEvent(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return "Order Placed: " + orderId;
    }
}

// Event Publisher
class EventPublisher {
    private List<EventListener> listeners = new ArrayList<>();

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void publish(Event event) {
        for (EventListener listener : listeners) {
            listener.onEvent(event);
        }
    }
}

// Event Listener Interface
interface EventListener {
    void onEvent(Event event);
}

// Order Service Listening for Events
class OrderService implements EventListener {
    public void onEvent(Event event) {
        System.out.println("Received event: " + event.getName());
    }
}
