/**
 * Created by nsp on 2015/10/21.
 */
public class DeviceButton {
    Command cmd;

    public DeviceButton(Command newCmd) {
        this.cmd = newCmd;
    }

    public  void press() {
        this.cmd.execute();
    }

    public void pressUndo() {
        this.cmd.undo();
    }
}
