package task3_Coffee_Shop_Simulator;

public class CoffeeDecorator implements Coffee{
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    } public double getCost() {
        return coffee.getCost();
    } public String getDescription() {
        return coffee.getDescription();
    }
}
