/**
 * Created by nsp on 2015/10/25.
 */
public class HasCard implements ATMState {
    ATMMachine atmMachine;

    public HasCard(ATMMachine machine) {
        this.atmMachine = machine;
    }

    @Override
    public void insertCard() {
        System.out.println("You cannot enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        this.atmMachine.setATMState(this.atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        if (pinEntered == 1234) {
            System.out.println("Correct Pin");
            this.atmMachine.correctPinEntered = true;

            this.atmMachine.setATMState(atmMachine.getHasPinState());
        } else {
            System.out.println("Incorrect Pin");
            this.atmMachine.correctPinEntered = false;
            this.ejectCard();
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter Pin First");
    }
}
