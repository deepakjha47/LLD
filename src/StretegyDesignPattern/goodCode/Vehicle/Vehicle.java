package StretegyDesignPattern.goodCode.Vehicle;

import StretegyDesignPattern.goodCode.stretegy.DriveStretegy;

public class Vehicle {
    DriveStretegy driveStretegy;
    public Vehicle(DriveStretegy driveStretegy){
        this.driveStretegy = driveStretegy;
    }
    public void drive(){
        driveStretegy.drive();
    }
}
