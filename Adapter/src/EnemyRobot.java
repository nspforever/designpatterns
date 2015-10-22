/**
 * Created by nsp on 2015/10/21.
 */

import java.util.Random;

public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Robot causes " + attackDamage + "Damage with Its hands");
    }

    public void walkForward() {
        int movement = generator.nextInt(5) + 1;

        System.out.println("Enemy Robot Walks forward " + movement + " Spaces");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }
}
