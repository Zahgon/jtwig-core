package org.jtwig.property.resolver;

import com.google.common.base.Optional;
import org.jtwig.property.resolver.request.PropertyResolveRequest;
import org.jtwig.reflection.model.Value;

public class EmptyPropertyResolver implements PropertyResolver {

    private static final EmptyPropertyResolver INSTANCE = new EmptyPropertyResolver();

    public static EmptyPropertyResolver instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private EmptyPropertyResolver() {
    }

    @Override
    public Optional<Value> resolve(PropertyResolveRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
