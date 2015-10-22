/**
 * Created by nsp on 2015/10/21.
 */
public class ItalianHoagie extends Hoagie {
    String[] meatUsed = {"Salami", "pepperoni", "Capicola Ham"};

    String[] cheeseUsed = {"Provolone"};

    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};

    String[] condimentsUsed = {"Oil", "Vinegar"};



    @Override
    void addMeat() {
        System.out.print("Adding the Meat: ");

        for (String meat : this.meatUsed) {
            System.out.print(meat + " ");
        }
    }

    @Override
    void addCheese() {
        System.out.print("Adding the Cheese: ");

        for (String cheese : this.cheeseUsed) {
            System.out.print(cheese + " ");
        }
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
