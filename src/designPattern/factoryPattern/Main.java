package designPattern.factoryPattern;

public class Main {
    public static void main(String[] args) {
        Shapefactory shapefactory = new Shapefactory();
        Shape shape = shapefactory.getShape("CIRCLE");
        Shape shape2 = shapefactory.getShape("RECTANGLE");
        shape.draw();
        shape2.draw();
    }
}
