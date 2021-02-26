package bankaccounts;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double initialBalance;
    private final List<Transaction> transactions;

    public BankAccount(double initialBalance) {
       this.transactions = new ArrayList<>();
       transactions.add(Transaction.depositOf(initialBalance));
    }

    public double getBalance() {
        return transactions.stream().mapToDouble(Transaction::getAmount).sum();
    }

    public double withdraw(double amount) {
        transactions.add(Transaction.withdrawalOf(amount));
        return getBalance();
    }

    public double deposit(double amount) {
        transactions.add(Transaction.depositOf(amount));
        return getBalance();
    }

    public List<Transaction> getTransactionHistory() {
        return new ArrayList<>(transactions);
    }
}
