package creational.factoryPattern.code;

public class Main {

    public static void main(String[] args) {
        //Factory Design pattern will not change the client code
        // it will remain same even if we have to add a new class
        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();

        OperatingSystem currentOperatingSystem = operatingSystemFactory.getInstance("Open");
        currentOperatingSystem.spec();

    }
}
