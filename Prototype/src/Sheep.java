/**
 * Created by gudu on 10/20/2015.
 */
public class Sheep implements Animal{

    public Sheep() {
        System.out.println("Ship is Made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Ship is Being Made");

        Sheep sheepObj = null;

        try {
            sheepObj = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheepObj;
    }

    public String toString() {
        return "Dolly is my Hero!!!";
    }
}
