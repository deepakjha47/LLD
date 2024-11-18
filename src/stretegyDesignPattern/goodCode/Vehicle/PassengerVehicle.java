package stretegyDesignPattern.goodCode.Vehicle;

import stretegyDesignPattern.goodCode.stretegy.NormalDriveStretegy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle(){
        super(new NormalDriveStretegy());
    }
}
