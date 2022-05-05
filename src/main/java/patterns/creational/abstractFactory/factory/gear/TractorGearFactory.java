package patterns.creational.abstractFactory.factory.gear;

import patterns.creational.abstractFactory.gear.TractorWheel;
import patterns.creational.abstractFactory.gear.Gear;
import patterns.creational.abstractFactory.gear.TankCaterpillar;

public class TractorGearFactory implements WheelGearFactory, CaterpillarGearFactory {
    @Override
    public Gear createCaterpillarGear() {
        return new TankCaterpillar();
    }

    @Override
    public Gear createWheelGear() {
        return new TractorWheel();
    }
}
