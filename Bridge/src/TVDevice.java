/**
 * Created by nsp on 2015/10/21.
 */
public class TVDevice extends EntertainmentDevice {
    public TVDevice(int newDeviceState, int newMaxSetting) {
        this.deviceState = newDeviceState;
        this.maxSetting = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Channel down");
        this.deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Channel up");
        this.deviceState++;
    }
}
