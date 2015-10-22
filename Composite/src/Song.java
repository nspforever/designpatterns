/**
 * Created by nsp on 2015/10/21.
 */
public class Song extends SongComponent {
    String name;
    String bandName;
    int releaseYear;

    public Song(String name, String bandName, int releaseYear) {
        this.name = name;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }

    public String getSongName() {
        return name;
    }

    @Override
    public String getBandName() {
        return bandName;
    }

    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    public void displaySongInfo() {
        System.out.println(getSongName() + " was recored by "
                + getBandName() + " in " + getReleaseYear());
    }
}
