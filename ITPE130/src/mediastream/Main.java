package mediastream;

import mediastream.media.*;
import mediastream.renderers.*;
import mediastream.sources.*;

public class Main {
    public static void main(String[] args) {

        // === Demo: Composite Pattern ===
        System.out.println("=== Demo: Composite Pattern ===");
        MediaPlayer player = new MediaPlayer(new SoftwareRenderer());

        // Create individual media files (local sources)
        Media song1 = new Media("Song 1", new LocalFileSource("C:/music/song1.mp3"));
        Media song2 = new Media("Song 2", new LocalFileSource("C:/music/song2.mp3"));
        Media video1 = new Media("Video 1", new LocalFileSource("C:/videos/video1.mp4"));

        // Create sub-playlist
        Playlist favoriteMusic = new Playlist("Favorite Music");
        favoriteMusic.add(song1);
        favoriteMusic.add(song2);

        // Create main playlist with nested playlist
        Playlist mainPlaylist = new Playlist("Main Playlist");
        mainPlaylist.add(favoriteMusic);
        mainPlaylist.add(video1);

        // Play the composite playlist
        System.out.println("Playing main playlist (with nested playlist):");
        player.playPlaylist(mainPlaylist);

        // === Demo: Strategy Pattern ===
        System.out.println("\n=== Demo: Strategy Pattern ===");
        Renderer hardware = new HardwareRenderer();
        Renderer software = new SoftwareRenderer();

        MediaSource remoteSource = new RemoteAPISource("https://jsonplaceholder.typicode.com/posts/1");
        Media remoteMedia = new Media("4K Video", remoteSource);

        System.out.println("\nUsing Hardware Rendering:");
        player.setRenderer(hardware);
        player.playMedia(remoteMedia);

        System.out.println("\nUsing Software Rendering:");
        player.setRenderer(software);
        player.playMedia(remoteMedia);

        // === Demo: Proxy Pattern ===
        System.out.println("\n=== Demo: Proxy Pattern ===");
        MediaSource proxySource = new ProxyMediaSource(
                new HlsStreamSource("https://example.com/live-stream.m3u8"));
        Media proxyMedia = new Media("Live Stream", proxySource);
        player.playMedia(proxyMedia);
    }
}
