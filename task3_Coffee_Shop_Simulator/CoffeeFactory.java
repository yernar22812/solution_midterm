package task3_Coffee_Shop_Simulator;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "expresso" -> new Expresso();
            case "cappuccino" -> new Cappuccino();
            case "latte" -> new Latte();
            case "americano" -> new Americano();
            default -> throw new IllegalArgumentException("Unknown coffee type: " + type);
        };
    }
}
