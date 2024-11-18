package stretegyDesignPattern.goodCode.Vehicle;

import stretegyDesignPattern.goodCode.stretegy.SpecialDriveStretegy;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle() {
        super(new SpecialDriveStretegy());
    }
}
