package task3_Coffee_Shop_Simulator;

public class CaramelDecorator extends  CoffeeDecorator{
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }public double getCost() {
        return super.getCost() + 150;
    } public String getDescription() {
        return super.getDescription() + ", Caramel";
    }
}
