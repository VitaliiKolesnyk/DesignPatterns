package patterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import patterns.creational.builder.components.*;

import java.util.List;

@AllArgsConstructor
@Setter
@ToString
public class Pizza {
    private final Dough dough;
    private final Sauce sauce;
    private final List<Cheese> cheeseList;
    private final List<Meat> meatList;
    private final List<Vegetables> vegetablesList;
}
