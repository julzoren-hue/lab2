package mediastream.plugins;

import mediastream.media.Media;

public class WatermarkPlugin implements Plugin {
    @Override
    public void apply(Media media) {
        System.out.println("Adding watermark to " + media.getTitle());
    }
}
