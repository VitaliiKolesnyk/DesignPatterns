package patterns.structural.facade.lock;

public class WindowLock implements Lock {
    private boolean isLocked;
    
    public boolean getStatus() {
        return isLocked;
    }
    
    @Override
    public void on() {
        isLocked = true;
    }

    @Override
    public void off() {
        isLocked = false;
    }
}
