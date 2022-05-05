package patterns.creational.abstractFactory.factory.vehicle;

import patterns.creational.abstractFactory.gear.GearType;
import patterns.creational.abstractFactory.vehicle.Vehicle;

public class TancFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(GearType type) {
        return null;
    }
}
