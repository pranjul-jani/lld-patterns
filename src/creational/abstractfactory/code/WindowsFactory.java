package creational.abstractfactory.code;

public class WindowsFactory implements IFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextbox createTextBox() {
        return new WindowsTextBox();
    }
}
