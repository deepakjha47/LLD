package solidPrinciple.liskov.goodCode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> l = new ArrayList<>();
        l.add(new Bike());
        l.add(new Cycle());
        //we cant access has engine since it is not applicable to cycle
        for(Vehicle v: l){
            if(v.getWheels() == 2){
                System.out.println("vehicle has engine");
            }
        }
    }

}
