package patterns.creational.abstractFactory.factory.gear;

import patterns.creational.abstractFactory.factory.gear.CaterpillarGearFactory;
import patterns.creational.abstractFactory.gear.Gear;
import patterns.creational.abstractFactory.gear.TankCaterpillar;

public class TankGearFactory implements CaterpillarGearFactory {
    @Override
    public Gear createCaterpillarGear() {
        return new TankCaterpillar();
    }
}
