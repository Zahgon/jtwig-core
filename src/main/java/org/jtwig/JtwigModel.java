package org.jtwig;

import com.google.common.base.Optional;
import org.jtwig.reflection.model.Value;
import java.util.HashMap;
import java.util.Map;

public class JtwigModel {

    public static JtwigModel newModel(Map<String, Object> values) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static JtwigModel newModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final Map<String, Value> values;

    public JtwigModel() {
        this.values = new HashMap<>();
    }

    public JtwigModel with(String name, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<Value> get(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
