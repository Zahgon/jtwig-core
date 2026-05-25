package org.jtwig.renderable.impl;

import org.jtwig.renderable.RenderResult;
import org.jtwig.renderable.Renderable;

public class FlushRenderable implements Renderable {

    private static final FlushRenderable INSTANCE = new FlushRenderable();

    public static FlushRenderable instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private FlushRenderable() {
    }

    @Override
    public RenderResult appendTo(RenderResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
