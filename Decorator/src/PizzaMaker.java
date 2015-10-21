/**
 * Created by gudu on 10/20/2015.
 */
public class PizzaMaker {

    public static void main(String[] args) {
        IPizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());
    }
}
