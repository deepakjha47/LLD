package decoratorPattern;

import decoratorPattern.pizza.BasePizza;
import decoratorPattern.pizza.FarmHouse;
import decoratorPattern.toppingsDecorator.Extracheese;
import decoratorPattern.toppingsDecorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new Extracheese(new FarmHouse()));
        int cost = pizza.cost();
        System.out.println("Pizza cost is : " + cost);
    }
}
