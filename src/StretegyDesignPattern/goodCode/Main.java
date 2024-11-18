package StretegyDesignPattern.goodCode;

import StretegyDesignPattern.goodCode.Vehicle.SportyVehicle;
import StretegyDesignPattern.goodCode.Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportyVehicle();
        vehicle.drive();
    }
}
