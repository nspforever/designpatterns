/**
 * Created by nsp on 2015/10/21.
 */
public class TVRemotePause extends RemoteButton{
    public TVRemotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV is paused");
    }
}
