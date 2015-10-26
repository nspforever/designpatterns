/**
 * Created by nsp on 2015/10/25.
 */
public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine machine) {
        this.atmMachine = machine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please Enter a PIN");
        this.atmMachine.setATMState(this.atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Enter a card first");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Enter a card first");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter a card first");
    }
}
