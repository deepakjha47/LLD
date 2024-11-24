package designPattern.abstractFactory;

import designPattern.abstractFactory.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Factory2 factory2 = new Factory2();;
        VehicleFactory vehicleFactory = factory2.getVehicleFactory("LVF");
        Vehicle vehicle = vehicleFactory.getVehicle("L1");
        vehicle.average();



    }
}
