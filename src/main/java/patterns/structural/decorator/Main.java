package patterns.structural.decorator;

import patterns.structural.decorator.abstractMunchkin.Munchkin;
import patterns.structural.decorator.advancedCharacters.Warrior;
import patterns.structural.decorator.advancedCharacters.Wizard;
import patterns.structural.decorator.standardCharacters.Dwarf;
import patterns.structural.decorator.standardCharacters.Human;

public class Main {
    public static void main(String[] args) {

        Munchkin myChar = new Wizard(new Dwarf());
        Munchkin enemy = new Warrior(new Human());

        System.out.println(myChar.getStatus());
        System.out.println(enemy.getStatus());
        System.out.println(myChar.fight(enemy));
    }
}
