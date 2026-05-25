package org.jtwig.property.strategy.method.finder;

import com.google.common.base.Optional;
import org.jtwig.property.strategy.method.MethodArgumentsMatcher;
import org.jtwig.reflection.model.java.JavaClass;
import org.jtwig.reflection.model.java.JavaMethod;
import org.jtwig.reflection.model.java.JavaMethods;
import java.util.List;

public class ExactMethodNamePropertyMethodFinder implements PropertyMethodFinder {

    private final MethodArgumentsMatcher methodArgumentsMatcher;

    public ExactMethodNamePropertyMethodFinder(MethodArgumentsMatcher methodArgumentsMatcher) {
        this.methodArgumentsMatcher = methodArgumentsMatcher;
    }

    @Override
    public Optional<JavaMethod> find(JavaClass type, String identifier, List<Object> arguments) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
