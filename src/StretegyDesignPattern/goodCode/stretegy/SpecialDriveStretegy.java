package StretegyDesignPattern.goodCode.stretegy;

public class SpecialDriveStretegy implements DriveStretegy{
    @Override
    public void drive() {
        System.out.println("Special drive Stretegy");
    }
}
