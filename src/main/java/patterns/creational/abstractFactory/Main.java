package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.factory.vehicle.TankFactory;
import patterns.creational.abstractFactory.factory.vehicle.TractorFactory;
import patterns.creational.abstractFactory.factory.vehicle.VehicleFactory;
import patterns.creational.abstractFactory.gear.GearType;
import patterns.creational.abstractFactory.vehicle.Tank;
import patterns.creational.abstractFactory.vehicle.Tractor;

public class Main {
    public static void main(String[] args) {
        VehicleFactory tankFactory = new TankFactory();
        VehicleFactory tractorFactory = new TractorFactory();
        
        Tank catTank = (Tank) tankFactory.createVehicle(GearType.CATERPILLAR);

        Tractor wheelTractor = (Tractor) tractorFactory.createVehicle(GearType.WHEEL);
        Tractor catTractor = (Tractor) tractorFactory.createVehicle(GearType.CATERPILLAR);

        System.out.println(catTank);
        System.out.println(catTractor);
        System.out.println(wheelTractor);
    }
}
