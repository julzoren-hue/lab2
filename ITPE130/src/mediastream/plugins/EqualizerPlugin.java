package mediastream.plugins;

import mediastream.media.Media;

public class EqualizerPlugin implements Plugin {
    @Override
    public void apply(Media media) {
        System.out.println("Applying equalizer settings to " + media.getTitle());
    }
}
