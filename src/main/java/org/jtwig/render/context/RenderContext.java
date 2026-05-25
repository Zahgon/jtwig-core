package org.jtwig.render.context;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RenderContext {

    public static RenderContext create() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final Map<Class, Stack<Context<?>>> contexts;

    public RenderContext(Map<Class, Stack<Context<?>>> contexts) {
        this.contexts = contexts;
    }

    public <T> RenderContext start(Class<T> type, T context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> T end(Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private <T> Context<T> getCurrentContext(Class<T> type) {
        if (!contexts.containsKey(type)) {
            throw new IllegalStateException(String.format("There is no context for %s", type));
        }
        return (Context<T>) contexts.get(type).peek();
    }

    public <T> T getCurrent(Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean hasCurrent(Class type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void onEndCurrent(Class type, Runnable runnable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> void set(Class<T> type, T item) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
