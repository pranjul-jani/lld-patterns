package creational.factoryPattern.code;

public class OperatingSystemFactory {

    public OperatingSystem getInstance(String str) {
        if (str.equals("Open")) {
            return new Android();
        } else if (str.equals("Closed")) {
            return new Ios();
        } else {
            return new Blackberry();
        }
    }
}
