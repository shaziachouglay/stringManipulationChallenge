package bankaccounts;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BankAccount {

    private List<Transaction> transactions;

    public BankAccount(double initialBalance) {
        this.transactions = new ArrayList<>();
        transactions.add(Transaction.depositOf(initialBalance));
    }

    public double getBalance() {
        double sumOfAllTheTransactions = 0.0;
        //below code for traditional java
//        for (Transaction transaction : transactions){
//            sumOfAllTheTransactions = sumOfAllTheTransactions + transaction.getAmount();
//        }
//        return sumOfAllTheTransactions;
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
