package patterns.creational.builder.builders;

import patterns.creational.builder.components.*;

public interface Builder {
    Builder setDough(Dough dough);

    Builder setSauce(Sauce sauce);

    Builder setCheese(Cheese... cheese);

    Builder setMeat(Meat... meat);

    Builder setVegetables(Vegetables... vegetables);
}
