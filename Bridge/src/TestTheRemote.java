/**
 * Created by nsp on 2015/10/21.
 */
public class TestTheRemote {
    public static void main(String[] args) {
        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));

        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));

        System.out.println("Test TV with Mute");

        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("Test TV with Pause");

        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV.buttonNinePressed();

        theTV2.deviceFeedback();

    }
}
