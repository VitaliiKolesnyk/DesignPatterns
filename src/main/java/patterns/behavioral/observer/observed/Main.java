package patterns.behavioral.observer.observed;

import patterns.behavioral.observer.observer.ConsoleObserver;
import patterns.behavioral.observer.observer.FileObserver;
import patterns.behavioral.observer.observer.Observer;

public class Main {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();
        Observer consoleObserver = new ConsoleObserver();
        Observer fileObserver = new FileObserver();
        
        station.addObserver(consoleObserver);
        station.addObserver(fileObserver);
        
        station.setMeasures(15, 720);
        station.setMeasures(20, 800);
    }
}
