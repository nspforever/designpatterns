/**
 * Created by nsp on 2015/10/21.
 */
public class FundsCheck {
    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return this.cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        this.cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashWithdrawn) {
        this.cashInAccount += cashWithdrawn;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {
        if (cashToWithdrawal > getCashInAccount()) {
            System.out.println("Error: You don't have enough money");
            System.out.println("Current balance: " + getCashInAccount());

            return false;
        } else {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdrawal complete: current balance is " + getCashInAccount());

            return true;
        }
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete: current balance is " + getCashInAccount());
    }
}

