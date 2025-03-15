package task2_Online_Payment_Gateway;

public class PaymentFactory {
    public static PaymentMethod createPaymentMethod(String type) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment(new CreditCardValidatorAdapter());
            case "paypal":
                return new PayPalPayment(new PayPalAPIAdapter());
            case "crypto":
                return new CryptoPayment();
            default:
                throw new IllegalArgumentException("Unknown payment method: " + type);
        }
    }
}
