package designPattern.stretegyDesignPattern.goodCode.Vehicle;

import designPattern.stretegyDesignPattern.goodCode.stretegy.SpecialDriveStretegy;

public class SportyVehicle extends Vehicle {
    public SportyVehicle(){
        super(new SpecialDriveStretegy());
    }
}
