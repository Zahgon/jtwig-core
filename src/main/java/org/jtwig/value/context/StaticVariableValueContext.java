package org.jtwig.value.context;

public class StaticVariableValueContext implements ValueContext {

    private final ValueContext parent;

    private final String staticKey;

    private final Object staticValue;

    public StaticVariableValueContext(ValueContext parent, String staticKey, Object staticValue) {
        this.parent = parent;
        this.staticKey = staticKey;
        this.staticValue = staticValue;
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
