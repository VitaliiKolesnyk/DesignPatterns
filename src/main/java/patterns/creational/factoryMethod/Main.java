package patterns.creational.factoryMethod;

import patterns.creational.factoryMethod.coffee.Coffee;
import patterns.creational.factoryMethod.enums.CoffeeType;
import patterns.creational.factoryMethod.enums.TeaType;
import patterns.creational.factoryMethod.factory.CoffeeFactory;
import patterns.creational.factoryMethod.factory.TeaFactory;
import patterns.creational.factoryMethod.tea.Tea;

public class Main {
    public static void main(String[] args) {
        TeaFactory teaFactory = new TeaFactory();
        Tea tea = teaFactory.prepareDrink(TeaType.BLACK);
        
        
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.prepareDrink(CoffeeType.CAPPUCINO);
        
    }
}
