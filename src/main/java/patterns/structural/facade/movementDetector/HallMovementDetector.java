package patterns.structural.facade.movementDetector;

public class HallMovementDetector implements MovementDetector {
    private int sensitivity = 40;
    private boolean turnedOn;
    
    public boolean getStatus() {
        return turnedOn;
    }
    
    public int getSensitivity() {
        return sensitivity;
    }

    @Override
    public void on() {
        turnedOn = true;
    }

    @Override
    public void off() {
        turnedOn = false;
    }

    @Override
    public void adjustSensitivity(int sensitivity) {
        this.sensitivity = sensitivity;
    }
}
