package org.jtwig.renderable.impl;

import org.jtwig.renderable.RenderResult;
import org.jtwig.renderable.Renderable;

public class FutureRenderable implements Renderable {

    private Renderable renderable;

    public FutureRenderable complete(Renderable renderable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public RenderResult appendTo(RenderResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
