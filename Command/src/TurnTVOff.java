/**
 * Created by nsp on 2015/10/21.
 */
public class TurnTVOff implements Command {
    ElectronicDevice device;

    public TurnTVOff(ElectronicDevice newDevice) {
        this.device = newDevice;
    }

    @Override
    public void execute() {
        this.device.off();
    }

    @Override
    public void undo() {
        this.device.on();
    }
}
