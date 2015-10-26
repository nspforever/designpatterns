/**
 * Created by nsp on 2015/10/25.
 */
public class ATMMachine implements GetATMData {
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMemory;

    ATMState atmState;

    int cashInMachine = 2000;

    @Override
    public ATMState getATMData() {
        return this.atmState;
    }

    @Override
    public int getCashInMachine() {
        return this.cashInMachine;
    }

    boolean correctPinEntered = false;

    public ATMMachine() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMemory = new NoCash(this);

        atmState = noCard;

        if (cashInMachine <= 0) {
            atmState = atmOutOfMemory;
        }
    }

    void setATMState(ATMState state) {
        this.atmState = state;
    }

    public void setCashInMachine(int newCashInMachine) {
        this.cashInMachine = newCashInMachine;
    }

    public void insertCard() {
        this.atmState.insertCard();
    }

    public void ejectCard() {
        this.atmState.ejectCard();;
    }

    public void requestCash(int cashToWithdraw) {
        this.atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int pin) {
        this.atmState.insertPin(pin);
    }

    public ATMState getHasCardState() {
        return this.hasCard;
    }

    public ATMState getNoCardState() {
        return this.noCard;
    }

    public ATMState getHasPinState() {
        return this.hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return this.atmOutOfMemory;
    }
}
