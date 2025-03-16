package task1_Smart_Home;

public class SmartDeviceDecorator implements SmartDevise{
    protected  SmartDevise decoratedDevice;
    public SmartDeviceDecorator(SmartDevise device) {
        this.decoratedDevice = device;
    }
    public void turnOn() {
        decoratedDevice.turnOn();
    } public void turnOff() {
        decoratedDevice.turnOff();
    }
    public String getStatus() {
        return decoratedDevice.getStatus();
    }
}
