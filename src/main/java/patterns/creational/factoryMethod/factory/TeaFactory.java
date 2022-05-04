package patterns.creational.factoryMethod.factory;

import patterns.creational.factoryMethod.enums.DrinkType;
import patterns.creational.factoryMethod.enums.TeaType;
import patterns.creational.factoryMethod.factory.DrinkFactory;
import patterns.creational.factoryMethod.tea.Black;
import patterns.creational.factoryMethod.tea.Green;
import patterns.creational.factoryMethod.tea.Tea;


public class TeaFactory extends DrinkFactory {
    @Override
    public Tea prepareDrink(DrinkType type) {
        Tea tea = null;
        
        switch ((TeaType) type) {
            case BLACK: tea = new Black();
            break;
            case GREEN: tea = new Green();
            break;
        }
        
        return tea;
    }
}
