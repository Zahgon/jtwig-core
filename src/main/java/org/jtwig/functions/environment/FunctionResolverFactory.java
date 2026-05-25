package org.jtwig.functions.environment;

import org.jtwig.exceptions.InvalidFunctionNameException;
import org.jtwig.functions.FunctionRequestFactory;
import org.jtwig.functions.JtwigFunction;
import org.jtwig.functions.resolver.CoreFunctionResolver;
import org.jtwig.functions.resolver.FunctionResolver;
import org.jtwig.functions.resolver.FunctionValueSupplierFactory;
import java.util.Collection;
import java.util.HashMap;

public class FunctionResolverFactory {

    public static final String IDENTIFIER_PATTERN = "[A-Za-z_$][A-Za-z0-9_$]*";

    public FunctionResolver create(Collection<JtwigFunction> functions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void validate(String name) {
        if (!name.matches(IDENTIFIER_PATTERN)) {
            throw new InvalidFunctionNameException(String.format("Function name %s is invalid, it should be an identifier (regular expression: %s)", name, IDENTIFIER_PATTERN));
        }
    }
}
