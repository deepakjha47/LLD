package decoratorPattern.toppingsDecorator;

import decoratorPattern.pizza.BasePizza;

public class Mushroom extends ToppingDecorator {

    BasePizza pizza;
    public Mushroom(BasePizza pizza){
        this.pizza=pizza;
    }
    @Override
    public int cost() {
        return pizza.cost() + 10;
    }
}
