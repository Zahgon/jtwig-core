package org.jtwig.property.strategy.method.finder;

import com.google.common.base.Optional;
import org.jtwig.reflection.model.java.JavaClass;
import org.jtwig.reflection.model.java.JavaMethod;
import java.util.List;

public class CompositePropertyMethodFinder implements PropertyMethodFinder {

    private final List<PropertyMethodFinder> propertyMethodFinder;

    public CompositePropertyMethodFinder(List<PropertyMethodFinder> propertyMethodFinder) {
        this.propertyMethodFinder = propertyMethodFinder;
    }

    @Override
    public Optional<JavaMethod> find(JavaClass type, String identifier, List<Object> arguments) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
