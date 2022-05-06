package patterns.structural.bridge.animal;

import patterns.structural.bridge.move.Moveable;

public class Monkey extends Animal {
    public Monkey(String name, int age, Moveable moveable) {
        super(name, age, moveable);
    }
}
