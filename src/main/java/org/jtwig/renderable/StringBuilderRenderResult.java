package org.jtwig.renderable;

public class StringBuilderRenderResult implements RenderResult {

    private final StringBuilder builder = new StringBuilder();

    @Override
    public RenderResult append(String content) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public RenderResult flush() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String content() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
