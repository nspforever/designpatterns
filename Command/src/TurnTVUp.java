/**
 * Created by nsp on 2015/10/21.
 */
public class TurnTVUp implements Command {
    ElectronicDevice device;

    public TurnTVUp(ElectronicDevice newDevice) {
        this.device = newDevice;
    }

    @Override
    public void execute() {
        this.device.volumnUp();
    }

    @Override
    public void undo() {
        this.device.volumnDown();
    }
}

