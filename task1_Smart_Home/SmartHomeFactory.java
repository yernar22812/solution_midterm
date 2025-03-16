package task1_Smart_Home;

public interface SmartHomeFactory {
Light createLight(String name);
Thermostat createThermostat(String name, double temp);
}
