/**
 * Created by nsp on 2015/10/25.
 */
public class TestStockMediator {
    public static void main(String[] args) {

        StockMediator nyse = new StockMediator();

        GormanSlacks broker = new GormanSlacks(nyse);
        JPPoorman broker2 = new JPPoorman(nyse);

        broker.saleOffer("MSFT", 100);
        broker.saleOffer("GOOG", 50);

        broker2.buyOffer("MSFT", 100);
        broker2.saleOffer("NRG", 10);

        broker.buyOffer("NRG", 10);

        nyse.getStockOfferings();

    }
}
