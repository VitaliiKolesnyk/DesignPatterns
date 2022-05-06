package patterns.structural.bridge.animal;

import patterns.structural.bridge.move.Moveable;

public class Fish extends Animal {
    public Fish(String name, int age, Moveable moveable) {
        super(name, age, moveable);
    }
}
