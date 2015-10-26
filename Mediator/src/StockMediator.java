import java.util.ArrayList;

/**
 * Created by nsp on 2015/10/25.
 */
public class StockMediator implements  Mediator {
    private ArrayList<Colleague> colleagues;
    private ArrayList<StockOffer> stockBuyOffers;
    private ArrayList<StockOffer> stockSellOffers;

    private int colleagueCodes = 0;

    public StockMediator() {
        this.colleagues = new ArrayList<Colleague>();
        this.stockBuyOffers = new ArrayList<StockOffer>();
        this.stockSellOffers = new ArrayList<StockOffer>();
    }

    @Override
    public void saleOffer(String stock, int shares, int collCode) {
        boolean stockSold = false;

        for (StockOffer offer: this.stockBuyOffers) {

            if (offer.getStockSymbol() == stock &&
                offer.getStockShares() == shares) {
                System.out.println(shares + " shares of " + stock +
                    " sold to colleague code " + offer.getColleagueCode());

                stockBuyOffers.remove(offer);
                stockSold = true;
                break;
            }
        }

        if (!stockSold) {
            System.out.println(shares + " share of " + stock + " added to inventory.");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            this.stockSellOffers.add(newOffering);
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int collCode) {
        boolean stockBought = false;

        for (StockOffer offer: this.stockSellOffers) {

            if (offer.getStockSymbol() == stock &&
                offer.getStockShares() == shares) {
                System.out.println(shares + " shares of " + stock +
                    " sold to colleague code " + offer.getColleagueCode());

                this.stockSellOffers.remove(offer);
                stockBought = true;
                break;
            }
        }

        if (!stockBought) {
            System.out.println(shares + " share of " + stock + " added to inventory.");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            this.stockBuyOffers.add(newOffering);
        }
    }

    @Override
    public void addCollege(Colleague colleague) {
        this.colleagues.add(colleague);
        this.colleagueCodes ++;
        colleague.setColleagueCode(this.colleagueCodes);
    }

    public void getStockOfferings() {
        System.out.println("\nStocks sale offers");
        for (StockOffer offer: this.stockSellOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());

        }

        System.out.println("\nStocks buy offers");
        for (StockOffer offer: this.stockBuyOffers) {
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());

        }
    }
}
