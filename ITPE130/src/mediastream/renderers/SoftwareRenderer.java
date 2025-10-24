package mediastream.renderers;

import mediastream.media.Media;

public class SoftwareRenderer implements Renderer {
    @Override
    public void render(Media media) {
        System.out.println("[Software Renderer] Rendering media: " + media.getTitle());
    }
}
