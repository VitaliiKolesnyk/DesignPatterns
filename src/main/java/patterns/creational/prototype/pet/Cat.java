package patterns.creational.prototype.pet;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(Pet pet) {
        super(pet);
    }

    @Override
    public Pet getCopy() {
        return new Cat(this);
    }
}
