package org.jtwig.renderable.impl;

import com.google.common.base.Optional;
import org.jtwig.renderable.RenderResult;
import org.jtwig.renderable.Renderable;

public class OverrideRenderable implements Renderable {

    private Optional<Renderable> override = Optional.absent();

    private final Renderable defaultContent;

    public OverrideRenderable(Renderable defaultContent) {
        this.defaultContent = defaultContent;
    }

    public OverrideRenderable overrideWith(Renderable override) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public RenderResult appendTo(RenderResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Renderable getDefault() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
