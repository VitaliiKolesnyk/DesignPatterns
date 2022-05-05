package patterns.creational.prototype.pet;

public class Dog extends Pet {
    
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(Pet pet) {
        super(pet);
    }

    @Override
    public Pet getCopy() {
        return new Dog(this);
    }
}
