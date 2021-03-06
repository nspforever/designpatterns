/**
 * Created by gudu on 10/20/2015.
 */
public class TestCloning {
    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep();

        Sheep clonedSheep = (Sheep)animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println("Sally: " + System.identityHashCode(sally));

        System.out.println("Clone: " + System.identityHashCode(clonedSheep));
    }
}
