/**
 * Created by gudu on 10/20/2015.
 */
public class PlainPizza implements IPizza {

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
