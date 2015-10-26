/**
 * Created by nsp on 2015/10/25.
 */
public class NoCash implements ATMState {
    ATMMachine atmMachine;

    public NoCash(ATMMachine machine) {
        this.atmMachine = machine;
    }

    @Override
    public void insertCard() {
        System.out.println("We Don't Have Money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We Don't Have Money");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We Don't Have Money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We Don't Have Money");
    }
}
