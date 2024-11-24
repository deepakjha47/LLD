package parkingLot;

import parkingLot.stretegy.PricingStretegy;

import javax.swing.*;

public class CostComputations {
    PricingStretegy pricingStretegy;
    CostComputations(PricingStretegy pricingStretegy){
        this.pricingStretegy = pricingStretegy;
    }
    int getPrice(){
        int price = pricingStretegy.getPrice();
        return price;
    }
}
