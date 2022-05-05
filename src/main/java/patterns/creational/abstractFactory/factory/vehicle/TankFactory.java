package patterns.creational.abstractFactory.factory.vehicle;

import patterns.creational.abstractFactory.factory.gear.TankGearFactory;
import patterns.creational.abstractFactory.gear.Gear;
import patterns.creational.abstractFactory.gear.GearType;
import patterns.creational.abstractFactory.vehicle.Tank;
import patterns.creational.abstractFactory.vehicle.Vehicle;

public class TankFactory implements VehicleFactory {
    
    TankGearFactory gearFactory = new TankGearFactory();
    
    @Override
    public Vehicle createVehicle(GearType type) {
        Tank tank = new Tank();
        Gear gear = null;
        
        switch (type) {
            case CATERPILLAR: gear = gearFactory.createCaterpillarGear();
            break;
        }
        
        tank.setGear(gear);
        
        return tank;
    }
}
