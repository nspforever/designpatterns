/**
 * Created by gudu on 10/20/2015.
 */

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.LinkedList;

public class ScrabbleTest {
    public static void main(String[] args) {
        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance 1 Id: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerOneTiles = newInstance.getTitles(1);

        System.out.println("Player 1: " + playerOneTiles);

        System.out.println(newInstance.getLetterList());

        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("Instance 2 Id: " + System.identityHashCode(newInstance));

        LinkedList<String> playerTwoTiles = newInstance.getTitles(1);

        System.out.println("Player 2: " + playerTwoTiles);
    }
}
