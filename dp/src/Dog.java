/**
 * Created by gudu on 10/19/2015.
 */
public class Dog extends Animal {
    public void digHole() {
        System.out.println("Dug a hole");
    }

    public Dog() {
        super();
        setSound("Bark");

        flyingType = new CantFly();
        setFlyingAbility(flyingType);
    }

    public void ChangeVar(int randNum) {
        randNum = 12;

        System.out.println("randNum in method " + randNum);
    }
}
