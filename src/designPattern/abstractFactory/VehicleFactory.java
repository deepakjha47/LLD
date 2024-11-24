package designPattern.abstractFactory;

import designPattern.abstractFactory.vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(String vehicleType);
}
