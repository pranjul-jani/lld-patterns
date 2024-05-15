package creational.abstractfactory.code;

public class GUIAbstractFactory {
    public static IFactory createFactory(String osType) {
        switch (osType) {
            case("Mac"):
                return new MacFactory();

            default:
                return new WindowsFactory();
        }

    }
}
