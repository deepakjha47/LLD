package designPattern.decoratorPattern.toppingsDecorator;

import designPattern.decoratorPattern.pizza.BasePizza;

public class Extracheese extends ToppingDecorator{

    BasePizza pizza;
    public Extracheese(BasePizza pizza){
        this.pizza=pizza;
    }
    @Override
    public int cost() {
        return pizza.cost() + 20;
    }
}
