/**
 * Created by nsp on 2015/10/21.
 */
public class Radio implements ElectronicDevice {

    private int volume;
    @Override
    public void on() {
        System.out.println("Radio is ON");
    }

    @Override
    public void off() {
        System.out.println("Radio is OFF");
    }

    @Override
    public void volumnUp() {
        this.volume++;
        System.out.println("Radio is volume is at " + this.volume);

    }

    @Override
    public void volumnDown() {
        this.volume--;
        System.out.println("Radio is volume is at " + this.volume);
    }
}
