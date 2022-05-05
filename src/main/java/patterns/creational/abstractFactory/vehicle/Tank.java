package patterns.creational.abstractFactory.vehicle;

import lombok.Setter;
import lombok.ToString;
import patterns.creational.abstractFactory.gear.Gear;

@Setter
@ToString
public class Tank extends Vehicle {
    Gear gear;
    
}
