package task2_Online_Payment_Gateway;

public class CryptoPayment implements PaymentMethod{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Cryptocurrency payment " + amount + " processed successfully.");
        return true;
    }
}