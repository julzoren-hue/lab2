package mediastream.sources;

public class LocalFileSource implements MediaSource {
    private String filePath;

    public LocalFileSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void load() {
        System.out.println("Loading local file: " + filePath);
    }

    @Override
    public String getSourceInfo() {
        return filePath;
    }
}
