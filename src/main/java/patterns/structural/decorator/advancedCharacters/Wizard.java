package patterns.structural.decorator.advancedCharacters;

import patterns.structural.decorator.abstractMunchkin.MagCharacter;
import patterns.structural.decorator.abstractMunchkin.Munchkin;
import patterns.structural.decorator.abstractMunchkin.WarCharacter;

public class Wizard implements MagCharacter {

    private MagCharacter wizard;

    public Wizard(MagCharacter wizard) {
        this.wizard = wizard;
        this.wizard.setMagic(wizard.getMagic() + 20);
        this.wizard.setHealthPoints(wizard.getHealthPoints() + 8);
    }
    @Override
    public int getStrength() {
        return wizard.getStrength();
    }
    @Override
    public void setStrength(int strength) {
        wizard.setStrength(strength);
    }
    @Override
    public int getMagic() {
        return wizard.getMagic();
    }
    @Override
    public void setMagic(int magic) {
        wizard.setMagic(magic);
    }
    @Override
    public int getHealthPoints() {
        return wizard.getHealthPoints();
    }
    @Override
    public void setHealthPoints(int healthPoints) {
        wizard.setHealthPoints(healthPoints);
    }

    @Override
    public String getStatus() {
        return "The character is: " + this.getClass().getSimpleName() + "-" + wizard.getClass().getSimpleName() + "\n"
                + "strength: " + wizard.getStrength() + "\n"
                + "magic: " + wizard.getMagic() + "\n"
                + "health points: " + wizard.getHealthPoints() + "\n";
    }

    @Override
    public String fight(Munchkin enemy) {
        while (wizard.getHealthPoints() > 0 && enemy.getHealthPoints() > 0) {
            enemy.setHealthPoints(enemy.getHealthPoints() - wizard.getMagic());
            if (enemy.getClass().equals(WarCharacter.class)) {
                wizard.setHealthPoints(wizard.getHealthPoints() - enemy.getStrength());
            } else {
                wizard.setHealthPoints(wizard.getHealthPoints() - enemy.getMagic());
            }
        }
        return wizard.getHealthPoints() > enemy.getHealthPoints() ? "You win!" : "You loose";
    }
}
