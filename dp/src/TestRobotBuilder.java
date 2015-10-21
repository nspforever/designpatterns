/**
 * Created by gudu on 10/20/2015.
 */
public class TestRobotBuilder {
    public static void main(String[] args) {
        RobotBuilder rb = new OldRobotBuild();

        RobotEngineer re = new RobotEngineer(rb);

        re.makeRobot();

        Robot firstRobot = re.getRobot();

        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
        System.out.println("Robot Arms Type: " + firstRobot.getRobotArms());
        System.out.println("Robot Legs Type: " + firstRobot.getRobotLegs());
    }
}
