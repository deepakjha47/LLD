package StretegyDesignPattern.goodCode.Vehicle;

import StretegyDesignPattern.goodCode.stretegy.SpecialDriveStretegy;

public class SportyVehicle extends Vehicle {
    public SportyVehicle(){
        super(new SpecialDriveStretegy());
    }
}
