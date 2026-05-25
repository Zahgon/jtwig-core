package org.jtwig.util.builder;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.builder.Builder;
import org.jtwig.environment.and.AndBuilder;
import java.util.HashMap;
import java.util.Map;

public class MapBuilder<B, K, V> implements Builder<Map<K, V>>, AndBuilder<B> {

    private final B parentBuilder;

    private Map<K, V> value = new HashMap<>();

    public MapBuilder(B parentBuilder) {
        this.parentBuilder = parentBuilder;
    }

    public MapBuilder(B parentBuilder, Map<K, V> values) {
        this.parentBuilder = parentBuilder;
        this.value = new HashMap<>(values);
    }

    public MapBuilder<B, K, V> add(K key, V value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MapBuilder<B, K, V> add(Map<K, V> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MapBuilder<B, K, V> set(Map<K, V> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MapBuilder<B, K, V> filter(Predicate<Map.Entry<K, V>> predicate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Map<K, V> build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public B and() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
