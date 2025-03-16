package task1_Smart_Home;

public class BasicSmartHomeFactory implements SmartHomeFactory {
    public Light createLight(String name) {
        return new Light(name);
    } public Thermostat createThermostat(String name, double temp) {
        return new Thermostat(name, temp);
    }
}
