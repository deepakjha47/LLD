package designPattern.solidPrinciple.liskov.badCode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> l = new ArrayList<>();
        l.add(new Bike());
        l.add(new Cycle());

        for(Vehicle v: l){
            if(v.hasEngine()){
                System.out.println("vehicle has engine");
            }
        }
    }

}
