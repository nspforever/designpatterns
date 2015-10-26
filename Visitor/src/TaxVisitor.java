import java.text.DecimalFormat;
import java.util.DoubleSummaryStatistics;

/**
 * Created by nsp on 2015/10/25.
 */
public class TaxVisitor implements Visitor {
    DecimalFormat df = new DecimalFormat("#.##");

    public TaxVisitor() {

    }

    @Override
    public double visit(Liquor item) {
        System.out.println("Liquor item: Price with Tax");
        return Double.parseDouble(df.format(item.getPrice() * .18 + item.getPrice()));
    }

    @Override
    public double visit(Tobacco item) {
        System.out.println("Tobacco item: Price with Tax");
        return Double.parseDouble(df.format(item.getPrice() * .32 + item.getPrice()));
    }

    @Override
    public double visit(Necessity item) {
        System.out.println("Necessity item: Price with Tax");
        return Double.parseDouble(df.format(item.getPrice() * 0 + item.getPrice()));
    }
}
