/**
 * Created by nsp on 2015/10/25.
 */
public interface Mediator {

    public void saleOffer(String stock, int shares, int collCode);
    public void buyOffer(String stock, int shares, int collCode);
    public void addCollege(Colleague colleague);
}
