package stretegyDesignPattern.goodCode.Vehicle;

import stretegyDesignPattern.goodCode.stretegy.SpecialDriveStretegy;

public class SportyVehicle extends Vehicle {
    public SportyVehicle(){
        super(new SpecialDriveStretegy());
    }
}
