package org.jtwig.functions.impl.string;

import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;

public class FormatFunction extends SimpleJtwigFunction {

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String getString(FunctionRequest request, int index) {
        return request.getEnvironment().getValueEnvironment().getStringConverter().convert(request.get(index));
    }
}
