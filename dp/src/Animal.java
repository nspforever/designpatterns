/**
 * Created by gudu on 10/19/2015.
 */
public class Animal {
    private String name;
    private double height;
    private int weight;
    private String sound;
    private String favFood;
    public Flys flyingType;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {

        this.speed = speed;
    }

    public String getFavFood() {

        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    private double speed;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        if(weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be greater than zero");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType) {
        flyingType = newFlyType;
    }

    /* Bad idea since not all animal can fly
    public void fly() {
        System.out.println("I'm flying");
    }*/
}
