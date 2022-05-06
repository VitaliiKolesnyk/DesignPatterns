package patterns.structural.bridge.animal;

import lombok.AllArgsConstructor;
import lombok.Data;
import patterns.structural.bridge.move.Moveable;

@AllArgsConstructor
@Data
public abstract class Animal {
    private String name;
    private int age;
    private Moveable moveable;
    
    public void move() {
     moveable.move();   
    }
}
