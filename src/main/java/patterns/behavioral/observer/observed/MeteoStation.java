package patterns.behavioral.observer.observed;

import patterns.behavioral.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {
    private int temperature;
    private int pressure;
    private List<Observer> observerList = new ArrayList<>();
    
    public void setMeasures(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }
    
    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.handleEvent(temperature, pressure);
        }
    }
}
