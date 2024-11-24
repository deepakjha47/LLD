package designPattern.decoratorPattern;

import designPattern.decoratorPattern.pizza.BasePizza;
import designPattern.decoratorPattern.pizza.FarmHouse;
import designPattern.decoratorPattern.toppingsDecorator.Extracheese;
import designPattern.decoratorPattern.toppingsDecorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new Extracheese(new FarmHouse()));
        int cost = pizza.cost();
        System.out.println("Pizza cost is : " + cost);
    }
}
