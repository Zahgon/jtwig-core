package org.jtwig.value.context;

import org.jtwig.value.Undefined;
import java.util.HashMap;
import java.util.Map;

public class MapValueContext implements ValueContext {

    public static MapValueContext newContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static MapValueContext newContext(Map<String, Object> map) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final Map<String, Object> values;

    public MapValueContext(Map<String, Object> values) {
        this.values = values;
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
