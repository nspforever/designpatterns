/**
 * Created by nsp on 2015/10/21.
 */
public class TVRemoteMute extends RemoteButton {

    public TVRemoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV is muted");
    }
}
