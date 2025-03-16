package task1_Smart_Home;

public class Thermostat implements SmartDevise {
    private String name;
    private double temperature;

    public Thermostat(String name, double initialTemp) {
        this.name = name;
        this.temperature = initialTemp;
    }

    public void turnOn() {
        System.out.println(name + " thermostat is on");

    }

    public void turnOff() {
        System.out.println(name + " thermostat is off");
    }
public void setTemperature(double temp) {
        this.temperature = temp;
    System.out.println(name + " thermostat is set to " + temperature);
}
    public String getStatus() {
return name + " thermostat is set to " + temperature;
    }
}


