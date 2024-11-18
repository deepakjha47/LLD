package liskov.badCode;

public class Bike extends Vehicle{
    @Override
    public boolean hasEngine(){
        return true;
    }

    @Override
    public int getWheels() {
        return 2;
    }
}
