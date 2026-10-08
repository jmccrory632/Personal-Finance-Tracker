import java.util.ArrayList;

public class FinanceManager {

    private ArrayList<Transaction> transactions;

    public FinanceManager() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void viewTransactions() {

        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public double calculateBalance() {

        double balance = 0;

        for (Transaction transaction : transactions) {

            if (transaction.getType().equalsIgnoreCase("Income")) {
                balance += transaction.getAmount();
            } else {
                balance -= transaction.getAmount();
            }
        }

        return balance;
    }
}