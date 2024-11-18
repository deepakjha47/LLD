package StretegyDesignPattern.goodCode.stretegy;

public class NormalDriveStretegy implements DriveStretegy{

    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
}
