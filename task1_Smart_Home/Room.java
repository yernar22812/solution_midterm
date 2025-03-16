package task1_Smart_Home;


import java.util.ArrayList;
import java.util.List;

public class Room implements SmartDevise {
    private String name;
    private List<SmartDevise> devices = new ArrayList<>();
    public Room(String name) {
        this.name = name;
    } public void addDevice(SmartDevise device) {
        devices.add(device);
    } public void removeDevice(SmartDevise device) {
        devices.remove(device);
    } public void turnOn() {
        System.out.println("Turning on all devices in " + name);
        for (SmartDevise device : devices) {
            device.turnOn();
        }
    } public void turnOff() {
        System.out.println("Turning off all devices in " + name);
        for (SmartDevise device : devices) {
            device.turnOff();
        }
    } public String getStatus() {
        StringBuilder status = new StringBuilder(name + " contains: \n");
        for (SmartDevise device : devices) {
            status.append("  - ").append(device.getStatus()).append("\n");
        }
        return status.toString();
    }
}

