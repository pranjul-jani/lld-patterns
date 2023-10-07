package structural.decoratorPattern.code;

public class WhippedCreamDecorator extends CoffeeDecorator {

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    int getCost() {
        return coffee.getCost() + 4;
    }

}
