package designPattern.factoryPattern;

public class Shapefactory {
    Shape getShape(String s){
        if(s=="CIRCLE"){
            return new Circle();
        }
        if(s== "RECTANGLE"){
            return new Rectangle();
        }
        return null;
    }
}
