package patterns.behavioral.observer.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        File file = new File("src/main/java/patterns/behavioral/observer/observer/file/meteo_measurements.txt");
        
        try(FileWriter writer = new FileWriter(file, true)) {
            writer.write("Current measurements: temperature - " + temperature + ", pressure - " + pressure + "\n");
        } catch (IOException e) {
            System.out.println("Measurement cannot be written to file");
        }
    }
}
