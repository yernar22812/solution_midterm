package task1_Smart_Home;

public class Light implements SmartDevise {
    private String name;
    private boolean isOn;
    public Light(String name) {
        this.name = name;

    } public void turnOn() {
        isOn = true;
        System.out.println(name + " turned on");
    } public void turnOff() {
        isOn = false;
        System.out.println(name + " turned off");
    } public String getStatus() {
        return name + " is " + (isOn ? "on" : "off");
    }
}
