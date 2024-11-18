package solidPrinciple.dependencyInversion.badCode;

/**
 * here keyboard is fixed and we con't change is to bloototh so better to create interface
 */
public class Main {

    private final WiredKeyboard keyboard;

    public Main(WiredKeyboard keyboard) {
        this.keyboard = keyboard;
    }
}
