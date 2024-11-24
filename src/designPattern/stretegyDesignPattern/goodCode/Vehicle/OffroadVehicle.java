package designPattern.stretegyDesignPattern.goodCode.Vehicle;

import designPattern.stretegyDesignPattern.goodCode.stretegy.SpecialDriveStretegy;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle() {
        super(new SpecialDriveStretegy());
    }
}
