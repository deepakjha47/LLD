package designPattern.solidPrinciple.dependencyInversion.goodCode;

/**
 * here keyboard is fixed and we con't change is to bloototh so better to create interface
 */
public class Main {

    private final Keyboard keyboard;

    public Main(Keyboard keyboard) {

        this.keyboard = keyboard;
    }
}
