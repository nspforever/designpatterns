/**
 * Created by nsp on 2015/10/21.
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot) {
        this.theRobot = newRobot;
    }

    @Override
    public void fireWeapon() {
        this.theRobot.smashWithHands();

    }

    @Override
    public void driveForward() {
        this.theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        this.theRobot.reactToHuman(driverName);
    }
}
