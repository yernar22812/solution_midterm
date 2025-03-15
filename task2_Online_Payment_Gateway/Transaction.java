package task2_Online_Payment_Gateway;

class Transaction {
    private static int idCounter = 1;
    private int id;
    private String status;
    private double amount;

    public Transaction(double amount, boolean success) {
        this.id = idCounter++;
        this.amount = amount;
        this.status = success ? "Completed" : "Failed";
    }

    @Override
    public String toString() {
        return "Transaction ID: " + id + ", Amount: " + amount + ", Status: " + status;
    }
}
