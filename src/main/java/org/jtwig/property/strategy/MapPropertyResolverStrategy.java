package org.jtwig.property.strategy;

import com.google.common.base.Optional;
import org.jtwig.model.expression.VariableExpression;
import org.jtwig.property.resolver.MapPropertyResolver;
import org.jtwig.property.resolver.PropertyResolver;
import java.util.Map;

public class MapPropertyResolverStrategy implements PropertyResolverStrategy {

    @Override
    public Optional<PropertyResolver> select(Request request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
