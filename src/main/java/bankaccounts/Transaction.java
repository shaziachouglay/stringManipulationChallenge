package bankaccounts;

import java.util.Objects;

public class Transaction {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    public double getAmount() {
        return amount;
    }

    private final double amount;

    public Transaction(double amount) {
        this.amount = amount;
    }

    public static Transaction depositOf(double amount) {
        return new Transaction(amount);
    }

    public static Transaction withdrawalOf(double amount) {
        return new Transaction(amount * -1);
    }
}
