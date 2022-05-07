package patterns.structural.facade.movementDetector;

public interface MovementDetector {
    void on();
    void off();
    void adjustSensitivity(int sensitivity);
}
