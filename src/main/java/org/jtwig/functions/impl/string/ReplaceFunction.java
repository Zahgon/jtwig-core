package org.jtwig.functions.impl.string;

import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import org.jtwig.value.WrappedCollection;
import java.util.Iterator;
import java.util.Map;

public class ReplaceFunction extends SimpleJtwigFunction {

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String getString(FunctionRequest request, Object value) {
        return request.getEnvironment().getValueEnvironment().getStringConverter().convert(value);
    }
}
