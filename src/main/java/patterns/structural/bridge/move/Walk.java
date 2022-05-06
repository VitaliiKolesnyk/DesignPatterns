package patterns.structural.bridge.move;

import patterns.structural.bridge.move.Moveable;

public class Walk implements Moveable {
    @Override
    public void move() {
        System.out.println("Animal walks.");
    }
}
