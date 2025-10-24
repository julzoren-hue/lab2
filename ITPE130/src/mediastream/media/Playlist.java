package mediastream.media;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Playable {
    private String name;
    private List<Playable> items = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void add(Playable playable) {
        items.add(playable);
    }

    @Override
    public void play() {
        System.out.println("Playing playlist: " + name);
        for (Playable p : items) {
            p.play();
        }
    }
}
