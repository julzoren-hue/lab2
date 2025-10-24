package mediastream.sources;

public class ProxyMediaSource implements MediaSource {
    private MediaSource realSource;

    public ProxyMediaSource(MediaSource realSource) {
        this.realSource = realSource;
    }

    @Override
    public void load() {
        System.out.println("Proxy: Checking access before streaming...");
        realSource.load();
        System.out.println("Proxy: Stream access verified.");
    }
}
