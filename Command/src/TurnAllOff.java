/**
 * Created by nsp on 2015/10/21.
 */
import java.util.List;

public class TurnAllOff implements Command{

    List<ElectronicDevice> theDevices;

    public TurnAllOff(List<ElectronicDevice> newDevices) {
        this.theDevices = newDevices;
    }

    @Override
    public void execute() {
        for (ElectronicDevice device : this.theDevices) {
            device.off();
        }
    }

    @Override
    public void undo() {
        for (ElectronicDevice device : this.theDevices) {
            device.on();
        }
    }
}
