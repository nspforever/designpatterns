/**
 * Created by gudu on 10/19/2015.
 */
public interface Subject {
    public void register(Observer O);
    public void unregister(Observer O);
    public void notifyObserver();
}
