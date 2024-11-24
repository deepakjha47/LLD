package designPattern.stretegyDesignPattern.goodCode.Vehicle;

import designPattern.stretegyDesignPattern.goodCode.stretegy.DriveStretegy;

public class Vehicle {
    DriveStretegy driveStretegy;
    public Vehicle(DriveStretegy driveStretegy){
        this.driveStretegy = driveStretegy;
    }
    public void drive(){
        driveStretegy.drive();
    }
}
