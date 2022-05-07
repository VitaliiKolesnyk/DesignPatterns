package patterns.structural.facade.security;

import javax.naming.OperationNotSupportedException;

public interface Security {
    void on();
    void off();
    void adjustMovementSensitivity(int...sensitivity) throws OperationNotSupportedException;
    void getSecurityStatus();
    void getMovementSensitivityLevel() ;
}
