/**
 * Created by nsp on 2015/10/21.
 */
public class DiscJockey {
    SongComponent songList;

    public DiscJockey(SongComponent songlist) {
        this.songList = songlist;
    }

    public void getSongList() {
        this.songList.displaySongInfo();
    }
}
