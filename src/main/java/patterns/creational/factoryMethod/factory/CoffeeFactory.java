package patterns.creational.factoryMethod.factory;

import patterns.creational.factoryMethod.coffee.Americano;
import patterns.creational.factoryMethod.coffee.Cappuccino;
import patterns.creational.factoryMethod.coffee.Coffee;
import patterns.creational.factoryMethod.enums.CoffeeType;
import patterns.creational.factoryMethod.enums.DrinkType;


public class CoffeeFactory extends DrinkFactory {
    @Override
    public Coffee prepareDrink(DrinkType type) {
        Coffee coffee = null;
        
        switch ((CoffeeType) type) {
            case AMERICANO: coffee = new Americano();
            break;
            case CAPPUCINO: coffee = new Cappuccino();
            break;
        }
        
        return coffee;
    }
}
