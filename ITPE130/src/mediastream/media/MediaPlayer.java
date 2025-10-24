package mediastream.media;

import mediastream.renderers.Renderer;

public class MediaPlayer {
    private Renderer renderer;

    public MediaPlayer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void playMedia(Media media) {
        System.out.println("Now playing: " + media.getTitle());
        renderer.render(media);
        System.out.println("Finished playing: " + media.getTitle());
    }

    public void playPlaylist(Playlist playlist) {
        playlist.play();
    }
}
