package patterns.creational.prototype;

import patterns.creational.prototype.pet.Cat;
import patterns.creational.prototype.pet.Dog;
import patterns.creational.prototype.pet.Pet;

public class Main {
    public static void main(String[] args) {
        
        Pet cat = new Cat("Barsik", 5);
        Pet copyCat = cat.getCopy();

        Pet dog = new Dog("Rex", 3);
        Pet copyDog = dog.getCopy();

    }
}
