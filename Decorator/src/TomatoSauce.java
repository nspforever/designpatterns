/**
 * Created by gudu on 10/20/2015.
 */
public class TomatoSauce extends ToppingDecorator {


    public TomatoSauce(IPizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");
    }

    @Override
    public String getDescription() {
        return this.tempPizza.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return this.tempPizza.getCost() + .35;
    }


}
