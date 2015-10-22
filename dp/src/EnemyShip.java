/**
 * Created by nsp on 2015/10/19.
 */
public abstract class EnemyShip {
    private String name;
    private double amtDamage;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return amtDamage;
    }

    public void setDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void followHeroShip() {
        System.out.println(this.getName() + " is following the hero");
    }

    public void displayEnemyShip() {
        System.out.println(this.getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(this.getName() + " attacks and does " + this.getDamage());
    }
}
