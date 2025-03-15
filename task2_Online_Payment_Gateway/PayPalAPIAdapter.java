package task2_Online_Payment_Gateway;

class PayPalAPIAdapter {
    public boolean pay(String email, double amount) {
        if (email.contains("@")) {
            System.out.println("Simulated PayPal payment " + amount + " processed for " + email);
            return true;
        }
        System.out.println("Invalid PayPal email.");
        return false;
    }
}