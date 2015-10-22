/**
 * Created by nsp on 2015/10/21.
 */
public class AccountNumberCheck {

    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public boolean accountActive(int accountNumberToCheck) {
        if (accountNumberToCheck == this.getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }
}

