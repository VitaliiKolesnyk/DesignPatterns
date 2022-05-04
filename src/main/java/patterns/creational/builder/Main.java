package patterns.creational.builder;

import patterns.creational.builder.builders.PizzaBuilder;
import patterns.creational.builder.components.*;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .setDough(Dough.THIN)
                .setSauce(Sauce.RED)
                .setCheese(Cheese.CHEDDER, Cheese.MOZZARELLA)
                .setMeat(Meat.CHIKEN)
                .setVegetables(Vegetables.OLIVES, Vegetables.TOMATO)
                .build();


        System.out.println(pizza);

    }
}
