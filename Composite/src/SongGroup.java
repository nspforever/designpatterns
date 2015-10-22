/**
 * Created by nsp on 2015/10/21.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
    ArrayList songComponents = new ArrayList();

    String groupName;
    String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(SongComponent component) {
        this.songComponents.add(component);
    }

    public void remove(SongComponent component) {

        this.songComponents.remove(component);
    }

    public SongComponent getComponent(int componentIndex) {
        return (SongComponent)this.songComponents.get(componentIndex);
    }

    public void displaySongInfo() {
        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");

        Iterator songIterator = this.songComponents.iterator();

        while(songIterator.hasNext()) {
            SongComponent song = (SongComponent)songIterator.next();
            song.displaySongInfo();
        }
    }


}
