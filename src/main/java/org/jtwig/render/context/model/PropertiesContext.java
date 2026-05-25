package org.jtwig.render.context.model;

import java.util.HashMap;
import java.util.Map;

public class PropertiesContext {

    public static PropertiesContext newContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final Map<String, Object> properties;

    public PropertiesContext(Map<String, Object> properties) {
        this.properties = properties;
    }

    public void set(String key, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T> T get(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean has(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
