/**
 * Created by nsp on 2015/10/19.
 */

import java.util.Scanner;

public class EnemyShipTesting {

    public  static void main(String[] args) {
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        String enemyShipOption = null;

        System.out.print("What type of ship?(U / R)");

        if (userInput.hasNextLine()) {
            enemyShipOption = userInput.nextLine();
        }

        if (enemyShipOption.equals("U")) {
            theEnemy = new UFOEnemyShip();
        } else {
            if (enemyShipOption.equals("R")) {
                theEnemy = new RocketEnemyShip();
            }
        }
        doStuffEnemy(theEnemy);
    }

    public  static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
