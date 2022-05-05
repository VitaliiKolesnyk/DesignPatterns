package patterns.creational.abstractFactory.factory.vehicle;

import patterns.creational.abstractFactory.factory.gear.TractorGearFactory;
import patterns.creational.abstractFactory.gear.Gear;
import patterns.creational.abstractFactory.gear.GearType;
import patterns.creational.abstractFactory.vehicle.Tractor;
import patterns.creational.abstractFactory.vehicle.Vehicle;

public class TractorFactory implements VehicleFactory {
    
    TractorGearFactory gearFactory = new TractorGearFactory();
    
    @Override
    public Vehicle createVehicle(GearType type) {
        Tractor tractor = new Tractor();
        Gear gear = null;
        
        switch (type) {
            case CATERPILLAR: gear = gearFactory.createCaterpillarGear();
            break;
            case WHEEL: gear = gearFactory.createWheelGear();
            break;
        }
        
        tractor.setGear(gear);
        
        return tractor;
    }
}
