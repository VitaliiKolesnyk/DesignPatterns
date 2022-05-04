package patterns.creational.factoryMethod.factory;

import patterns.creational.factoryMethod.Drink;
import patterns.creational.factoryMethod.enums.DrinkType;

public abstract class DrinkFactory {
    
    public abstract Drink prepareDrink(DrinkType type);
}
