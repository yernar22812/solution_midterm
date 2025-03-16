package task1_Smart_Home;

public class LoggingDecorator extends SmartDeviceDecorator{
    public LoggingDecorator(SmartDevise device) {
        super(device);
    }
    public void turnOn() {
        System.out.println("[LOG] Turning on device");
        super.turnOn();
    }

    public void turnOff() {
        System.out.println("[LOG] Turning off device");
        super.turnOff();
    }

}
