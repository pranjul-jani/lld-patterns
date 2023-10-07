package structural.decoratorPattern.code;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new Latte();
        System.out.println("You're current cost is " + coffee.getCost());

        //Adding Soy milk to coffee
        Coffee soyMilkCoffee = new SoyMilkDecorator(coffee);
        System.out.println("You're current cost is " + soyMilkCoffee.getCost());

        //Adding whipped cream to coffee
        Coffee whippedCreamCoffee = new WhippedCreamDecorator(soyMilkCoffee);
        System.out.println("You're current cost is " + whippedCreamCoffee.getCost());

    }
}
