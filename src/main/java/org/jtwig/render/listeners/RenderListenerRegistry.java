package org.jtwig.render.listeners;

import org.jtwig.render.RenderRequest;
import java.util.List;
import java.util.Map;

public class RenderListenerRegistry {

    private final Map<RenderStage, List<RenderListener>> listeners;

    public RenderListenerRegistry(Map<RenderStage, List<RenderListener>> listeners) {
        this.listeners = listeners;
    }

    public void trigger(RenderStage stage, RenderRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
