/**
 * Created by gudu on 10/19/2015.
 */
public class AnimalPlay {
    public  static void main(String[] args) {
        Animal sparky = new Dog();

        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());

        System.out.println("Bird: " + tweety.tryToFly());
    }
}
