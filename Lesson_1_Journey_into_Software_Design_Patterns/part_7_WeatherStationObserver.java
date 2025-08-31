import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

public interface Observer {
    void update();
}

public class PhoneDisplay implements Observer {
    public void update() {
        System.out.println("Phone display updated with new weather data!");
    }
}
