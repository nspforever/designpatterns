/**
 * Created by nsp on 2015/10/21.
 */

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {
    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();

    int haskKey = 0;

    public SongsOfThe90s() {
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad the Wet Sprocket", 1991);
    }

    public void addSong(String name, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(name, bandName, yearReleased);

        this.bestSongs.put(this.haskKey++, songInfo);
    }

    @Override
    public Iterator createIterator() {
        return this.bestSongs.values().iterator();
    }
}
