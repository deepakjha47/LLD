package designPattern.abstractFactory;

import designPattern.abstractFactory.vehicle.OrdinaryVehicle;
import designPattern.abstractFactory.vehicle.OrdinaryVehicle2;
import designPattern.abstractFactory.vehicle.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == "O1") {
            return new OrdinaryVehicle();
        }
        else if(vehicleType =="O2"){
            return new OrdinaryVehicle2();
        }
        else{
            return null;
        }
    }
}
