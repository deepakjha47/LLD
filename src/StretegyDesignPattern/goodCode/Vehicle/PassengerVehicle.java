package StretegyDesignPattern.goodCode.Vehicle;

import StretegyDesignPattern.goodCode.stretegy.NormalDriveStretegy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle(){
        super(new NormalDriveStretegy());
    }
}
