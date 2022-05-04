package patterns.creational.builder.builders;

import patterns.creational.builder.Pizza;
import patterns.creational.builder.components.*;

import java.util.Arrays;
import java.util.List;

public class PizzaBuilder implements Builder {
    private Dough dough;
    private Sauce sauce;
    private List<Cheese> cheseeList;
    private List<Meat> meatList;
    private List<Vegetables> vegetablesList;

    @Override
    public PizzaBuilder setDough(Dough dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setSauce(Sauce sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder setCheese(Cheese... cheese) {
        this.cheseeList = Arrays.asList(cheese);
        return this;
    }

    @Override
    public PizzaBuilder setMeat(Meat... meat) {
        this.meatList = Arrays.asList(meat);
        return this;
    }

    @Override
    public PizzaBuilder setVegetables(Vegetables... vegetables) {
        this.vegetablesList = Arrays.asList(vegetables);
        return this;
    }

    public Pizza build() {
        return new Pizza(dough, sauce, cheseeList, meatList, vegetablesList);
    }
}
