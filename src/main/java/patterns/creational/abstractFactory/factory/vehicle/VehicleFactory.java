package patterns.creational.abstractFactory.factory.vehicle;

import patterns.creational.abstractFactory.gear.GearType;
import patterns.creational.abstractFactory.vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(GearType type);
}
