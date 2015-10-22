/**
 * Created by nsp on 2015/10/19.
 */

import java.util.Scanner;

public class EnemyShipFactoryTesting {

    public static void main(String[] args) {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.print("What type of ship?(U / R /B)");

        if (userInput.hasNextLine()) {
            theEnemy = enemyShipFactory.makeEnemyShip(userInput.nextLine());
        }

        doStuffEnemy(theEnemy);
    }

    public  static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
