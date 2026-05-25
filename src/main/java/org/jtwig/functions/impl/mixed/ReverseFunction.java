package org.jtwig.functions.impl.mixed;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import org.jtwig.value.WrappedCollection;
import org.jtwig.value.convert.Converter;
import java.util.ArrayList;
import java.util.Collection;

public class ReverseFunction extends SimpleJtwigFunction {

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Collection<Object> reverse(Collection<Object> values) {
        return Lists.reverse(new ArrayList<>(values));
    }
}
