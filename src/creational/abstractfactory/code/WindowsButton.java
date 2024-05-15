package creational.abstractfactory.code;

public class WindowsButton implements IButton{
    @Override
    public void press() {
        System.out.println("Windows Button pressed");
    }
}
