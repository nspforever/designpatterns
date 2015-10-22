/**
 * Created by nsp on 2015/10/21.
 */
public class BankAccountFacade {
    private int accountNumber;

    private int securityCode;

    AccountNumberCheck accountChecker;
    SecurityCodeCheck securityCodeChecker;
    FundsCheck fundChecker;

    WelcomeBank bankWelcome;

    public BankAccountFacade(int newAccountNumber, int newSecCode) {
        this.accountNumber = newAccountNumber;
        this.securityCode = newSecCode;

        this.bankWelcome = new WelcomeBank();
        this.accountChecker = new AccountNumberCheck();
        this.securityCodeChecker = new SecurityCodeCheck();
        this.fundChecker = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (accountChecker.accountActive(getAccountNumber()) &&
                securityCodeChecker.isSecurityCodeCorrect(getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToGet)) {
            System.out.println("Transaction Complete \n");
        } else  {
            System.out.println("Transaction Failed \n");
        }
    }

    public void depositCash(double cashToDeposit) {
        if (accountChecker.accountActive(getAccountNumber()) &&
                securityCodeChecker.isSecurityCodeCorrect(getSecurityCode())) {

            fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete \n");
        }
    }
}
