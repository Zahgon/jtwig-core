package org.jtwig.value.context;

import com.google.common.base.Optional;
import org.jtwig.JtwigModel;
import org.jtwig.reflection.model.Value;
import org.jtwig.value.Undefined;

public class JtwigModelValueContext implements ValueContext {

    private final JtwigModel jtwigModel;

    public JtwigModelValueContext(JtwigModel jtwigModel) {
        this.jtwigModel = jtwigModel;
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
