/**
 * Created by nsp on 2015/10/21.
 */

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

    public DiscJockey(SongIterator songs70s, SongIterator songs80s, SongIterator songs90s) {
        this.iter70sSongs = songs70s;
        this.iter80sSongs = songs80s;
        this.iter90sSongs = songs90s;
    }

    public void showTheSongs() {
        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter80sSongs.createIterator();
        Iterator songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");

        printTheSongs(songs70s);

        System.out.println("Songs of the 80s\n");

        printTheSongs(songs80s);

        System.out.println("Songs of the 90s\n");

        printTheSongs(songs90s);
    }

    public void printTheSongs(Iterator iterator) {
        while(iterator.hasNext()) {
            SongInfo songInfo = (SongInfo)iterator.next();
            System.out.println(songInfo.getName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
        }
    }
}
