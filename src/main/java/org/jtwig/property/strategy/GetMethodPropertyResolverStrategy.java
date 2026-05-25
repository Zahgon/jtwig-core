package org.jtwig.property.strategy;

import com.google.common.base.Optional;
import org.jtwig.model.expression.VariableExpression;
import org.jtwig.property.resolver.CallMethodPropertyResolver;
import org.jtwig.property.resolver.PropertyResolver;
import org.jtwig.reflection.model.java.JavaClass;
import org.jtwig.reflection.model.java.JavaClassManager;
import org.jtwig.reflection.model.java.JavaMethod;
import org.jtwig.reflection.model.java.JavaMethods;

public class GetMethodPropertyResolverStrategy implements PropertyResolverStrategy {

    private final JavaClassManager classManager;

    public GetMethodPropertyResolverStrategy(JavaClassManager classManager) {
        this.classManager = classManager;
    }

    @Override
    public Optional<PropertyResolver> select(Request request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
