package org.jtwig.renderable.impl;

import org.jtwig.renderable.RenderResult;
import org.jtwig.renderable.Renderable;

public class EmptyRenderable implements Renderable {

    private static final EmptyRenderable instance = new EmptyRenderable();

    public static EmptyRenderable instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private EmptyRenderable() {
    }

    @Override
    public RenderResult appendTo(RenderResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
