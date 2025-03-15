package task2_Online_Payment_Gateway;

class CreditCardValidatorAdapter {
    public boolean validate(String cardNumber) {
        return cardNumber.length() >= 13 && cardNumber.length() <= 19;
    }
}