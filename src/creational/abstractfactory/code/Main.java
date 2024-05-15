package creational.abstractfactory.code;

/*
            CLIENT
GUI FACTORY                     Button                       TextBox
MAC Factory WINDOWS Factory      MAC Button Win Button    Mac text box WIN text box

 */
public class Main {

    public static void main(String[] args) {

        String osType = "Mac";

        IFactory factory = GUIAbstractFactory.createFactory(osType);

        IButton button = factory.createButton();
        button.press();

        ITextbox textBox = factory.createTextBox();
        textBox.showText();

    }
}
