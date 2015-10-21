/**
 * Created by gudu on 10/20/2015.
 */
public abstract class ToppingDecorator implements IPizza {
    protected IPizza tempPizza;

    public ToppingDecorator(IPizza newPizza) {
        this.tempPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return this.tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return this.tempPizza.getCost();
    }
}
