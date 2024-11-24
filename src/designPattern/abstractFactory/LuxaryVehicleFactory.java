package designPattern.abstractFactory;

import designPattern.abstractFactory.vehicle.LuxaryVehicle;
import designPattern.abstractFactory.vehicle.LuxaryVehicle2;
import designPattern.abstractFactory.vehicle.Vehicle;

public class LuxaryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == "L1") {
            return new LuxaryVehicle();
        }
        else if(vehicleType =="L2"){
            return new LuxaryVehicle2();
        }
        else{
            return null;
        }
    }
}
