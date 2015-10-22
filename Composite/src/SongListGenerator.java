/**
 * Created by nsp on 2015/10/21.
 */
public class SongListGenerator {
    public static void main(String[] args) {
        SongComponent industMusic = new SongGroup("Industrial", "");

        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "");

        SongComponent dubstepMusic = new SongGroup("Dubstep", "");

        SongComponent everySong = new SongGroup("Song List", "Every Song Available");

        everySong.add(industMusic);
        industMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industMusic.add(new Song("Headhunter", "Front 242", 1988));

        industMusic.add(dubstepMusic);

        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        DiscJockey crazyLarry = new DiscJockey(everySong);

        crazyLarry.getSongList();
    }
}
