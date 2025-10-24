package mediastream.renderers;

import mediastream.media.Media;

public class HardwareRenderer implements Renderer {
    @Override
    public void render(Media media) {
        System.out.println("[Hardware Renderer] Rendering media: " + media.getTitle());
    }
}
