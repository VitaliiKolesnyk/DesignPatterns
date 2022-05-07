package patterns.structural.facade;

import javax.naming.OperationNotSupportedException;

public class Main {
    public static void main(String[] args) {
        SecuritySystem securitySystem = new SecuritySystem();

        securitySystem.on();
        securitySystem.getSecurityStatus();

        securitySystem.off();
        securitySystem.getSecurityStatus();

        try {
            securitySystem.adjustMovementSensitivity(50, 60, 70);
        } catch (OperationNotSupportedException e) {
            System.out.println("Not correct quantity of sensitive parameters was indicated");
        }
        
        securitySystem.getMovementSensitivityLevel();
    }
}
