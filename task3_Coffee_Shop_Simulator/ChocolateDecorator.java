package task3_Coffee_Shop_Simulator;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    } public double getCost() {
        return super.getCost() + 200;
    } public String getDescription() {
        return super.getDescription() + ", Chocolate" ;
    }
}
