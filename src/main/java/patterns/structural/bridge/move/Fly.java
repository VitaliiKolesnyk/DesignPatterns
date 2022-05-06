package patterns.structural.bridge.move;

public class Fly implements Moveable {
    @Override
    public void move() {
        System.out.println("Animal flies.");
    }
}
