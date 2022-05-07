package patterns.structural.facade;

import patterns.structural.facade.lock.DoorLock;
import patterns.structural.facade.lock.WindowLock;
import patterns.structural.facade.movementDetector.HallMovementDetector;
import patterns.structural.facade.movementDetector.KitchenMovementDetector;
import patterns.structural.facade.movementDetector.RoomMovementDetector;

import javax.naming.OperationNotSupportedException;

public class SecuritySystem {
    DoorLock doorLock = new DoorLock();
    WindowLock windowLock = new WindowLock();
    KitchenMovementDetector kitchenMovementDetector = new KitchenMovementDetector();
    RoomMovementDetector roomMovementDetector = new RoomMovementDetector();
    HallMovementDetector hallMovementDetector = new HallMovementDetector();
    
    public void on() {
        doorLock.on();
        windowLock.on();
        kitchenMovementDetector.on();
        roomMovementDetector.on();
        hallMovementDetector.on();
    }
    
    public void off() {
        doorLock.off();
        windowLock.off();
        kitchenMovementDetector.off();
        roomMovementDetector.off();
        hallMovementDetector.off();
    }
    
    public void adjustMovementSensitivity(int...sensitivity) throws OperationNotSupportedException {
        if (sensitivity.length == 1) {
            kitchenMovementDetector.adjustSensitivity(sensitivity[0]);
            roomMovementDetector.adjustSensitivity(sensitivity[0]);
            hallMovementDetector.adjustSensitivity(sensitivity[0]);
        } if (sensitivity.length == 3) {
            kitchenMovementDetector.adjustSensitivity(sensitivity[0]);
            roomMovementDetector.adjustSensitivity(sensitivity[1]);
            hallMovementDetector.adjustSensitivity(sensitivity[2]);
        } else {
            throw new OperationNotSupportedException();
        }
    }
    
    public void getSecurityStatus() {
        System.out.println("Door lock is on - " + doorLock.getStatus());
        System.out.println("Window lock is on - " + windowLock.getStatus());
        System.out.println("Kitchen movement detector is on - " + kitchenMovementDetector.getStatus());
        System.out.println("Room movement detector is on - " + roomMovementDetector.getStatus());
        System.out.println("Hall movement detector is on - " + hallMovementDetector.getStatus());
    }
    
    public void getMovementSensitivityLevel() {
        System.out.println("Kitchen sensitivity level - " + kitchenMovementDetector.getSensitivity());
        System.out.println("Room sensitivity level - " + roomMovementDetector.getSensitivity());
        System.out.println("Hall sensitivity level - " + hallMovementDetector.getSensitivity());
    }
}
