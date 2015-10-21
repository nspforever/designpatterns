/**
 * Created by gudu on 10/20/2015.
 */
public class Robot implements RobotPlan {
    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    @Override
    public void setRobotHead(String head) {
        this.robotHead = head;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.robotTorso = torso;
    }

    @Override
    public void setRobotArms(String arms) {
        this.robotArms = arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.robotLegs = legs;
    }

    public String getRobotHead() {
        return this.robotHead;
    }

    public String getRobotTorso() {
        return this.robotTorso;
    }

    public String getRobotArms() {
        return this.robotArms;
    }

    public String getRobotLegs() {
        return this.robotLegs;
    }


}
