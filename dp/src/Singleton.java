/**
 * Created by gudu on 10/20/2015.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;


public class Singleton {
    private static Singleton firstInstance = null;

    String[] scrabbleLetters = { "a", "a" };

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;

    private Singleton() { }

    public static Singleton getInstance() {
        if (firstInstance == null) {

            if (firstThread) {
                firstThread = false;
                Thread.currentThread();
                try {
                    Thread.sleep(1000);
                } catch (java.lang.InterruptedException ex)
                {
                    ex.printStackTrace();
                }
            }

            synchronized (Singleton.class) {
                if (firstInstance == null) {
                    firstInstance = new Singleton();
                }
            }
        }
        return firstInstance;
    }

    public LinkedList<String> getLetterList() {
        return firstInstance.letterList;
    }

    public LinkedList<String> getTitles(int howManyTiles) {
        LinkedList<String> tilesToSend = new LinkedList<String>();

        for (int i = 0; i < howManyTiles; ++i) {
            tilesToSend.add(firstInstance.letterList.remove(0));
        }
        return tilesToSend;
    }
}
