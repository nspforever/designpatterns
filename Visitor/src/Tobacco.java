/**
 * Created by nsp on 2015/10/25.
 */
public class Tobacco implements Visitable {

    private double price;

    Tobacco(double item) {
        price = item;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}
