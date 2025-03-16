package task1_Smart_Home;

import java.util.*;

public class SmartHomeController {
    private List<SmartDevise> devices = new ArrayList<>();
    public void addDevice(SmartDevise device) {
        devices.add(device);
    }
    public void turnAllOn() {
        for (SmartDevise device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        for (SmartDevise device : devices) {
            device.turnOff();
        }
    }

    public void getStatusReport() {
        for (SmartDevise device : devices) {
            System.out.println(device.getStatus());
        }
    }
}
