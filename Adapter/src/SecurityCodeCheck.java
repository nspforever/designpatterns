/**
 * Created by nsp on 2015/10/21.
 */
public class SecurityCodeCheck {
    private int securityCode = 1234;

    public int getSecurityCode() {
        return this.securityCode;
    }

    public boolean isSecurityCodeCorrect(int securityCode) {
        if (securityCode == this.getSecurityCode()) {
            return true;
        } else {
            return false;
        }
    }
}
