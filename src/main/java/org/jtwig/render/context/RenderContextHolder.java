package org.jtwig.render.context;

public class RenderContextHolder {

    private static final ThreadLocal<RenderContext> current = new ThreadLocal<>();

    private RenderContextHolder() {
    }

    public static RenderContext set(RenderContext context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static RenderContext get() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
