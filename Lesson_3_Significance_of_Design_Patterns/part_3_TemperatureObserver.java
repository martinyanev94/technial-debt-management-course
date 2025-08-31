import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature);
}

class TemperatureSensor {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

class DisplayUnit implements Observer {
    private String name;

    public DisplayUnit(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " updated to: " + temperature + " degrees.");
    }
}
