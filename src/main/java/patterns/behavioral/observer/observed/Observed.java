package patterns.behavioral.observer.observed;

import patterns.behavioral.observer.observer.Observer;

public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
