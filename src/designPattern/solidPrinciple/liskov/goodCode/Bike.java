package designPattern.solidPrinciple.liskov.goodCode;

public class Bike extends EngineVehicle {
    @Override
    public boolean hasEngine(){
        return true;
    }

    @Override
    public int getWheels() {
        return 2;
    }
}
