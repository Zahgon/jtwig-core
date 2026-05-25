package org.jtwig.property.strategy;

import com.google.common.base.Optional;
import org.jtwig.model.expression.VariableExpression;
import org.jtwig.property.resolver.PropertyResolver;
import org.jtwig.property.resolver.ValueContextPropertyResolver;
import org.jtwig.value.context.ValueContext;

public class ValueContextPropertyResolverStrategy implements PropertyResolverStrategy {

    @Override
    public Optional<PropertyResolver> select(Request request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
