package designPattern.stretegyDesignPattern.goodCode.Vehicle;

import designPattern.stretegyDesignPattern.goodCode.stretegy.NormalDriveStretegy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle(){
        super(new NormalDriveStretegy());
    }
}
