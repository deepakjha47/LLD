package designPattern.stretegyDesignPattern.goodCode;

import designPattern.stretegyDesignPattern.goodCode.Vehicle.SportyVehicle;
import designPattern.stretegyDesignPattern.goodCode.Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportyVehicle();
        vehicle.drive();
    }
}
