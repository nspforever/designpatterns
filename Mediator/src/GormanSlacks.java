/**
 * Created by nsp on 2015/10/25.
 */
public class GormanSlacks extends Colleague {

    public GormanSlacks(Mediator newMediator) {
        super(newMediator);
        System.out.println("Gorman Slacks signed up with the stock exchange \n");
    }

    @Override
    public void saleOffer(String stock, int shares) {
        super.saleOffer(stock, shares);
    }

    @Override
    public void buyOffer(String stock, int shares) {
        super.buyOffer(stock, shares);
    }

    @Override
    public void setColleagueCode(int colleagueCode) {
        super.setColleagueCode(colleagueCode);
    }
}
