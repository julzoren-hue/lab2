package mediastream.media;

import mediastream.sources.MediaSource;

public class Media implements Playable {
    private String title;
    private MediaSource source;

    public Media(String title, MediaSource source) {
        this.title = title;
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public MediaSource getSource() {
        return source;
    }

    @Override
    public void play() {
        System.out.println("Playing media: " + title);
        source.load();
    }
}
