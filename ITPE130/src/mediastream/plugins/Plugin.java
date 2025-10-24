package mediastream.plugins;

import java.util.ArrayList;
import java.util.List;
import mediastream.media.Media;

public interface Plugin {
    void beforePlay(Media media);
    void afterPlay(Media media);

    static List<Plugin> getActivePlugins() {
        return activePlugins;
    }

    List<Plugin> activePlugins = new ArrayList<>();
}
