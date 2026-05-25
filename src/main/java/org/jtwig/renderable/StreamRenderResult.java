package org.jtwig.renderable;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class StreamRenderResult implements RenderResult {

    private final OutputStream outputStream;

    private final Charset charset;

    public StreamRenderResult(OutputStream outputStream, Charset charset) {
        this.outputStream = outputStream;
        this.charset = charset;
    }

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
