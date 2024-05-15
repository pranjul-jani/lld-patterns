package creational.abstractfactory.code;

public class MacButton implements IButton {
    @Override
    public void press() {
        System.out.println("Mac Button pressed");
    }
}
