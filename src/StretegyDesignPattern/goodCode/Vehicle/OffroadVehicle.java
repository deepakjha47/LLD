package StretegyDesignPattern.goodCode.Vehicle;

import StretegyDesignPattern.goodCode.stretegy.SpecialDriveStretegy;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle() {
        super(new SpecialDriveStretegy());
    }
}
