/**
 * Created by gudu on 10/20/2015.
 */
public class ScabbleTestThreads {

    public static void main(String[] args) {
        Runnable getTiles = new GetTheTiles();

        Runnable getTilesAgain = new GetTheTiles();

        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();
    }
}
