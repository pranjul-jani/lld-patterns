package creational.abstractfactory.code;

public class MacFactory implements IFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextbox createTextBox() {
        return new MacTextBox();
    }
}
