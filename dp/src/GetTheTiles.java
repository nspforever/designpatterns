/**
 * Created by gudu on 10/20/2015.
 */

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance Id: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerTwoTiles = newInstance.getTitles(1);

        System.out.println("Player: " + playerTwoTiles);

        System.out.println("Got Tiles");
    }
}
