package org.jtwig.escape;

public class NoneEscapeEngine implements EscapeEngine {

    private static final NoneEscapeEngine instance = new NoneEscapeEngine();

    public static NoneEscapeEngine instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private NoneEscapeEngine() {
    }

    @Override
    public String escape(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
