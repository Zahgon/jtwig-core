package org.jtwig.util;

import org.jtwig.value.WrappedCollection;
import org.jtwig.value.context.ValueContext;
import java.util.concurrent.atomic.AtomicInteger;

public class LoopCursor {

    private final AtomicInteger index;

    private final ValueContext parentContext;

    private final WrappedCollection collection;

    public LoopCursor(ValueContext parentContext, WrappedCollection collection) {
        this.index = new AtomicInteger(0);
        this.parentContext = parentContext;
        this.collection = collection;
    }

    public int step() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getIndex0() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ValueContext getParent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isFirst() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isLast() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getRevindex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getRevindex0() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
