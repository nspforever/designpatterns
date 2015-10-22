/**
 * Created by nsp on 2015/10/21.
 */
public class SongInfo {
    String name;
    String bandName;
    int yearReleased;

    public SongInfo(String name, String bandName, int yearReleased) {
        this.name = name;
        this.bandName = bandName;

        this.yearReleased = yearReleased;
    }

    public String getName() {
        return name;
    }

    public String getBandName() {
        return bandName;
    }

    public int getYearReleased() {
        return yearReleased;
    }
}
