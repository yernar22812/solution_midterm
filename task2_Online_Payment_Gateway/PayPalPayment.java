package task2_Online_Payment_Gateway;
import java.util.Scanner;
public class PayPalPayment implements PaymentMethod{
    private PayPalAPIAdapter payPalAPI;

    public PayPalPayment(PayPalAPIAdapter payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public boolean processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PayPal Email: ");
        String email = scanner.nextLine();

        return payPalAPI.pay(email, amount);
    }
}
