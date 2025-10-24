package mediastream;

import mediastream.media.*;
import mediastream.sources.*;
import mediastream.renderers.*;

public class Main {
    public static void main(String[] args) {
        // Composite Pattern Demo
        System.out.println("=== Demo: Composite Pattern ===");
        MediaSource remoteSource = new RemoteAPISource("https://api.example.com/media");
        Media m1 = new Media("Song 1", remoteSource);
        Media m2 = new Media("Song 2", remoteSource);

        Playlist rockPlaylist = new Playlist("Rock Playlist");
        rockPlaylist.add(m1);
        rockPlaylist.add(m2);

        Playlist masterPlaylist = new Playlist("Master Playlist");
        masterPlaylist.add(rockPlaylist);
        masterPlaylist.add(new Media("Bonus Track", remoteSource));

        MediaPlayer player = new MediaPlayer(new SoftwareRenderer());
        player.playPlaylist(masterPlaylist);

        // Strategy Pattern Demo
        System.out.println("\n=== Demo: Renderer Strategy Pattern ===");
        Media remoteMedia = new Media("Sample Remote Media", new RemoteAPISource("https://api.example.com/sample"));
        player.setRenderer(new HardwareRenderer());
        player.playMedia(remoteMedia);

        player.setRenderer(new SoftwareRenderer());
        player.playMedia(remoteMedia);

        // Proxy Pattern Demo
        System.out.println("\n=== Demo: Proxy Pattern ===");
        MediaSource proxySource = new ProxyMediaSource(new HlsStreamSource("https://example.com/live-stream.m3u8"));
        Media proxyMedia = new Media("Live Stream via Proxy", proxySource);
        player.playMedia(proxyMedia);
    }
}
