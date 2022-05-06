package patterns.structural.bridge.animal;

import patterns.structural.bridge.move.Moveable;

public class Bird extends Animal {
    public Bird(String name, int age, Moveable moveable) {
        super(name, age, moveable);
    }
}
