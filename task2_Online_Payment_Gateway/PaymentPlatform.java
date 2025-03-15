package task2_Online_Payment_Gateway;
import java.util.Scanner;
public class PaymentPlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionHistory history = new TransactionHistory();

        while (true) {
            System.out.println("\nSelect Payment Method: creditcard, paypal, crypto (or 'exit' to quit)");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("exit")) {
                System.out.println("\nTransaction History:");
                history.showHistory();
                break;
            }

            System.out.print("Enter amount to pay: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            try {
                PaymentMethod payment = PaymentFactory.createPaymentMethod(type);
                boolean success = payment.processPayment(amount);
                history.addTransaction(new Transaction(amount, success));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

