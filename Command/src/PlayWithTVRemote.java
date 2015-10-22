/**
 * Created by nsp on 2015/10/21.
 */
import java.util.ArrayList;
import java.util.List;

public class PlayWithTVRemote {
    public static void main(String[] args) {
        ElectronicDevice device = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(device);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        TurnTVOff offCommand = new TurnTVOff(device);

        onPressed = new DeviceButton(offCommand);

        onPressed.press();


        TurnTVUp upCommand = new TurnTVUp(device);

        onPressed = new DeviceButton(upCommand);

        onPressed.press();
        onPressed.press();
        onPressed.press();
        onPressed.press();

        Television theTV = new Television();

        Radio theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

        allDevices.add(theRadio);
        allDevices.add(theTV);

        TurnAllOff turnOffDevices = new TurnAllOff(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();

        turnThemOff.pressUndo();
    }
}
