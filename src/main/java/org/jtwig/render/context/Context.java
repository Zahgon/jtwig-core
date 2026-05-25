package org.jtwig.render.context;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Context<T> {

    public static <T> Context<T> create(T item) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final AtomicReference<T> item;

    private final List<Runnable> endTasks;

    private Context(T item, List<Runnable> endTasks) {
        this.item = new AtomicReference<>(item);
        this.endTasks = endTasks;
    }

    public T getItem() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void onEnd(Runnable run) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void end() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void set(T item) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
