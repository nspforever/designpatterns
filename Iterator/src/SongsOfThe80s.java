/**
 * Created by nsp on 2015/10/21.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class SongsOfThe80s implements SongIterator{
    SongInfo[] bestSongs;

    int arrayValue = 0;

    public SongsOfThe80s() {
        this.bestSongs = new SongInfo[3];

        addSong("Roam", "B52s Lennon", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears for Fears", 1985);
    }

    public void addSong(String name, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(name, bandName, yearReleased);

        this.bestSongs[this.arrayValue++] = songInfo;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
