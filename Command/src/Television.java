/**
 * Created by nsp on 2015/10/21.
 */
public class Television implements ElectronicDevice {

    private int volume = 0;



    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");

    }

    @Override
    public void volumnUp() {
        this.volume++;
        System.out.println("TV is volume is at " + this.volume);

    }

    @Override
    public void volumnDown() {
        this.volume--;
        System.out.println("TV is volume is at " + this.volume);
    }
}
