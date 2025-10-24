package mediastream.sources;

public class RemoteAPISource implements MediaSource {
    private String endpoint;

    public RemoteAPISource(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public void load() {
        System.out.println("Fetching media from remote API: " + endpoint);
    }
}
