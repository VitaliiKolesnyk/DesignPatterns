 package patterns.behavioral.observer.observer;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("Current measurements: temperature - " + temperature + ", pressure - " + pressure);
    }
}
