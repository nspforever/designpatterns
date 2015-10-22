/**
 * Created by nsp on 2015/10/21.
 */
public class TurnTVOn implements Command {
    ElectronicDevice device;

    public TurnTVOn(ElectronicDevice newDevice) {
        this.device = newDevice;
    }

    @Override
    public void undo() {
        this.device.off();
    }

    @Override
    public void execute() {
        this.device.on();
    }
}
