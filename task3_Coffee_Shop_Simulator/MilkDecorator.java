package task3_Coffee_Shop_Simulator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    } public double getCost() {
        return super.getCost() + 100;
    } public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
