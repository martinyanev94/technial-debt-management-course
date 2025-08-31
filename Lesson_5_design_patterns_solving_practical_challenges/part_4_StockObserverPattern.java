import java.util.ArrayList;
import java.util.List;

public interface Observer {
    void update(float price);
}

public class StockObserver implements Observer {
    private String observerName;

    public StockObserver(String name) {
        this.observerName = name;
    }

    @Override
    public void update(float price) {
        System.out.println(observerName + " received an update: Stock price is now " + price);
    }
}

public class Stock {
    private List<Observer> observers = new ArrayList<>();
    private float price;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
