package org.jtwig.value.context;

import org.jtwig.value.Undefined;

public class IsolateParentValueContext implements ValueContext {

    private final ValueContext parent;

    private final ValueContext current;

    public IsolateParentValueContext(ValueContext parent, ValueContext current) {
        this.parent = parent;
        this.current = current;
    }

    @Override
    public Object resolve(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public ValueContext with(String key, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
