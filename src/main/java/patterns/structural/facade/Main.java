package patterns.structural.facade;

import patterns.structural.facade.security.Security;
import patterns.structural.facade.security.SecuritySystem;

import javax.naming.OperationNotSupportedException;

public class Main {
    public static void main(String[] args) {
        Security securitySystem = new SecuritySystem();

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
