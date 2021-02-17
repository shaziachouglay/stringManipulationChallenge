package bankaccounts;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class WhenCreatingABankAccount {

    @Test
    public void initialBalancaShouldBeZero() {
        BankAccount account = new BankAccount(0.0);
        double currentBalance = account.getBalance();
        assertThat(currentBalance).isEqualTo(0.0);

    }

    @Test
    public void shouldBeAbleToMAkeAnInitialDeposit() {
        BankAccount account = new BankAccount(100);
        double currentBalance = account.getBalance();
        assertThat(currentBalance).isEqualTo(100);
    }

    @Test
    public void shouldBeAbleToWithdrawMoney() {
        BankAccount account = new BankAccount(100);
        account.withdraw(20);
        double currentBalance = account.getBalance();
        assertThat(currentBalance).isEqualTo(80);
    }

    @Test
    public void shouldBeAbleToDepositMoney() {
        BankAccount account = new BankAccount(100);
        account.deposit(20);
        double currentBalance = account.getBalance();
        assertThat(currentBalance).isEqualTo(120);
    }

    @Test
    public void shouldBeAbleToViewTransactionHistory() {
        BankAccount account = new BankAccount(100);
        account.deposit(20);
        account.withdraw(50);

        assertThat(account.getTransactionHistory()).containsExactly(
                Transaction.depositOf(100),
                Transaction.depositOf(20),
                Transaction.withdrawalOf(50)
        );
    }
}
