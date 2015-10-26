/**
 * Created by nsp on 2015/10/25.
 */
public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine machine) {
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
        System.out.println("Already entered");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if (cashToWithdraw > this.atmMachine.cashInMachine) {
            System.out.println("Don't have enough cash");
        } else {
            System.out.println(cashToWithdraw + " is provided by the machine");
            this.atmMachine.setCashInMachine(this.atmMachine.cashInMachine - cashToWithdraw);

            if (atmMachine.cashInMachine <= 0) {
                this.atmMachine.setATMState(this.atmMachine.getNoCashState());
            }
        }
    }
}
