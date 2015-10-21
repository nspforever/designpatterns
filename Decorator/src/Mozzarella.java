/**
 * Created by gudu on 10/20/2015.
 */
public class Mozzarella extends ToppingDecorator {
    public Mozzarella(IPizza newPizza) {
        super(newPizza);

        System.out.println("Adding Dough");

        System.out.println("Adding Moz");
    }

    @Override
    public String getDescription() {
        return this.tempPizza.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return this.tempPizza.getCost() + .50;
    }
}
