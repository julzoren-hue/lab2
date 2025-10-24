package mediastream.sources;

public class HlsStreamSource implements MediaSource {
    private String url;

    public HlsStreamSource(String url) {
        this.url = url;
    }

    @Override
    public void load() {
        System.out.println("Loading HLS Stream: " + url);
    }
}
