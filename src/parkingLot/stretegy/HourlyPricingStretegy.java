package parkingLot.stretegy;

public class HourlyPricingStretegy implements PricingStretegy{
    @Override
    public int getPrice() {
        return 100;
    }
}
