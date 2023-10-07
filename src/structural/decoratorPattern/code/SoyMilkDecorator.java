package structural.decoratorPattern.code;

public class SoyMilkDecorator extends CoffeeDecorator {

    public SoyMilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    int getCost() {
        return coffee.getCost() + 2;
    }
}
