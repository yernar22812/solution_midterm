package task2_Online_Payment_Gateway;
import java.util.Scanner;
public class CreditCardPayment implements PaymentMethod {
    private CreditCardValidatorAdapter validator;

    public CreditCardPayment(CreditCardValidatorAdapter validator) {
        this.validator = validator;
    }

    @Override
    public boolean processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Credit Card Number: ");
        String cardNumber = scanner.nextLine();

        if (validator.validate(cardNumber)) {
            System.out.println("Credit Card payment " + amount + " processed successfully.");
            return true;
        }
        System.out.println("Credit Card validation failed.");
        return false;
    }
}