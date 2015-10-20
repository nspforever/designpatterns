/**
 * Created by gudu on 10/19/2015.
 */
public class WorkWithAnimals {
    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.digHole();

        fido.setWeight(-1);

        int randNum = 10;

        fido.ChangeVar(randNum);

        System.out.println("randNum after method call: " + randNum);
    }
}
