package designPattern.abstractFactory;

public class Factory2 {
    VehicleFactory getVehicleFactory(String factoryType){
        if(factoryType == "LVF"){
             return new LuxaryVehicleFactory();
        }
        else if(factoryType == "OVF"){
            return new OrdinaryVehicleFactory();
        }
        return null;
    }
}
