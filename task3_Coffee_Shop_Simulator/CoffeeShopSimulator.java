package task3_Coffee_Shop_Simulator;
import java.util.Scanner;
public class CoffeeShopSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Shop by Yernar!");
        System.out.println("Choose a coffee type: Espresso, Cappuccino, Latte, Americano");
        String coffeeType = scanner.nextLine();

        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);

        while (true) {
            System.out.println("Add an ingredient (milk, caramel, whipped cream, chocolate) or type 'done':");
            String topping = scanner.nextLine().toLowerCase();
            switch (topping) {
                case "milk": coffee = new MilkDecorator(coffee); break;
                case "caramel": coffee = new CaramelDecorator(coffee); break;
                case "whipped cream": coffee = new WhippedCreamDecorator(coffee); break;
                case "chocolate": coffee = new ChocolateDecorator(coffee); break;
                case "done":
                    System.out.println("Your order: " + coffee.getDescription());
                    System.out.printf("Total cost in tg: %.2f\n", coffee.getCost());
                    return;
                default:
                    System.out.println("Invalid ingredient, please try again.");
            }
        }
    }
}