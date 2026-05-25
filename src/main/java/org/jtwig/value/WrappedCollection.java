package org.jtwig.value;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class WrappedCollection implements Iterable<Map.Entry<String, Object>> {

    public static WrappedCollection empty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static WrappedCollection singleton(Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final LinkedHashMap<String, Object> store;

    public WrappedCollection() {
        this.store = new LinkedHashMap<>();
    }

    public WrappedCollection add(String key, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Iterator<Map.Entry<String, Object>> iterator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<String> keys() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object getValue(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<Object> values() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
