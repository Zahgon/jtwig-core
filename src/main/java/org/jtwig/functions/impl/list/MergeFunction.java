package org.jtwig.functions.impl.list;

import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import org.jtwig.value.WrappedCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MergeFunction extends SimpleJtwigFunction {

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private WrappedCollection getCollection(FunctionRequest request, Object value) {
        return request.getEnvironment().getValueEnvironment().getCollectionConverter().convert(value).or(WrappedCollection.singleton(value));
    }
}
