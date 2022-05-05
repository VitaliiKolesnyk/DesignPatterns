package patterns.creational.prototype.pet;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Pet {
    private String name;
    private int age;

    public Pet(Pet pet) {
        this.name = pet.name;
        this.age = pet.age;
    }

    public abstract Pet getCopy();
}
