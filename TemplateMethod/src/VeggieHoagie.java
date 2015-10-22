/**
 * Created by nsp on 2015/10/21.
 */
/**
 * Created by nsp on 2015/10/21.
 */
public class VeggieHoagie extends Hoagie {

    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};

    String[] condimentsUsed = {"Oil", "Vinegar"};

    boolean customerWantsMeat() {
        return false;
    }

    boolean customerWantsCheese() {
        return false;
    }

    @Override
    void addMeat() {

    }

    @Override
    void addCheese() {

    }

    @Override
    void addVegetables() {
        System.out.print("Adding the Vegetable: ");

        for (String veggie : this.veggiesUsed) {
            System.out.print(veggie + " ");
        }
    }

    @Override
    void addCondiments() {
        System.out.print("Adding the Condiments: ");

        for (String condiment : this.condimentsUsed) {
            System.out.print(condiment + " ");
        }
    }
}

