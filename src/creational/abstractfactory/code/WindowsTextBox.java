package creational.abstractfactory.code;

public class WindowsTextBox implements ITextbox {
    @Override
    public void showText() {
        System.out.println("Enter into Windows Text box");
    }
}
