import java.util.ArrayList;

/**
 * Created by nsp on 2015/10/25.
 */
public class CareTaker {

    ArrayList<Memento> savedArticles = new ArrayList<>();

    public void addMemento(Memento m) {
        this.savedArticles.add(m);
    }

    public Memento getMemento(int index) {
        return (Memento)this.savedArticles.get(index);
    }
}
