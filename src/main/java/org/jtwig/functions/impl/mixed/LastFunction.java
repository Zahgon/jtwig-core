package org.jtwig.functions.impl.mixed;

import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import org.jtwig.value.Undefined;
import org.jtwig.value.WrappedCollection;
import org.jtwig.value.convert.Converter;
import java.util.Iterator;
import java.util.Map;

public class LastFunction extends SimpleJtwigFunction {

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Object last(Iterator<Map.Entry<String, Object>> iterator) {
        Map.Entry<String, Object> last = iterator.next();
        while (iterator.hasNext()) {
            last = iterator.next();
        }
        return last.getValue();
    }
}
