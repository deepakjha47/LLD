package designPattern.solidPrinciple.liskov.badCode;

public class Cycle extends Vehicle{

    public int getWheels(){
        return 2;
    }
    public boolean hasEngine(){
        throw new RuntimeException("sorry");
    }
}
