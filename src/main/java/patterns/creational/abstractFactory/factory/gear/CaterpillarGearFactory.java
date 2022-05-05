package patterns.creational.abstractFactory.factory.gear;

import patterns.creational.abstractFactory.factory.gear.GearFactory;
import patterns.creational.abstractFactory.gear.Gear;

public interface CaterpillarGearFactory extends GearFactory {
    Gear createCaterpillarGear();
}
