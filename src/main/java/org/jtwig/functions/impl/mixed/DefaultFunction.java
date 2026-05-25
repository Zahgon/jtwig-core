package org.jtwig.functions.impl.mixed;

import org.jtwig.exceptions.ResolveValueException;
import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import org.jtwig.value.Undefined;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultFunction extends SimpleJtwigFunction {

    private final Logger log = LoggerFactory.getLogger(DefaultFunction.class);

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
