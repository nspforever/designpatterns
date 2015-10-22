/**
 * Created by nsp on 2015/10/21.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {
    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {
        this.bestSongs = new ArrayList<SongInfo>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    @Override
    public Iterator createIterator() {

        return bestSongs.iterator();
    }

    public void addSong(String name, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(name, bandName, yearReleased);

        bestSongs.add(songInfo);
    }

    /*public ArrayList<SongInfo> getBestSongs() {
        return this.bestSongs;
    }*/
}
