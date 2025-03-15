package task2_Online_Payment_Gateway;

import java.util.ArrayList;
import java.util.List;


class TransactionHistory {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void showHistory() {
        transactions.forEach(System.out::println);
    }
}
