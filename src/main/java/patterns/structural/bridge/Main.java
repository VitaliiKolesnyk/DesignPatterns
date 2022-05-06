package patterns.structural.bridge;

import patterns.structural.bridge.animal.Animal;
import patterns.structural.bridge.animal.Bird;
import patterns.structural.bridge.animal.Fish;
import patterns.structural.bridge.animal.Monkey;
import patterns.structural.bridge.move.Fly;
import patterns.structural.bridge.move.Swim;
import patterns.structural.bridge.move.Walk;

public class Main {
    public static void main(String[] args) {
        Animal monkey = new Monkey("Monkey", 1, new Walk());
        Animal bird = new Bird("Bird", 1, new Fly());
        Animal fish = new Fish("Fish", 1, new Swim());
        
        monkey.move();
        bird.move();
        fish.move();
    }
}
