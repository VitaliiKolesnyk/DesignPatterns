package patterns.structural.decorator.standardCharacters;

import patterns.structural.decorator.abstractMunchkin.MagCharacter;
import patterns.structural.decorator.abstractMunchkin.Munchkin;
import patterns.structural.decorator.abstractMunchkin.WarCharacter;

public class Dwarf implements MagCharacter {
    private int strength;
    private int magic;
    private int healthPoints;

    public Dwarf() {
        this.strength = Munchkin.strength + 15;
        this.magic = Munchkin.magic;
        this.healthPoints = Munchkin.healthPoints + 5;
    }
    @Override
    public int getStrength() {
        return strength;
    }
    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }
    @Override
    public int getMagic() {
        return magic;
    }
    @Override
    public void setMagic(int magic) {
        this.magic = magic;
    }
    @Override
    public int getHealthPoints() {
        return healthPoints;
    }
    @Override
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public String getStatus() {
        return "The character is: " + this.getClass().getSimpleName() + "\n"
                + "strength: " + this.strength + "\n"
                + "magic: " + this.magic + "\n"
                + "health points: " + this.healthPoints + "\n";
    }

    @Override
    public String fight(Munchkin enemy) {
        while (this.getHealthPoints() > 0 && enemy.getHealthPoints() > 0) {
            enemy.setHealthPoints(enemy.getHealthPoints() - this.getMagic());
            if (enemy.getClass().equals(WarCharacter.class)) {
                this.setHealthPoints(this.healthPoints - enemy.getStrength());
            } else {
                this.setHealthPoints(this.healthPoints - enemy.getMagic());
            }
        }
        return this.getHealthPoints() > enemy.getHealthPoints() ? "You win!" : "You loose";
    }
}
