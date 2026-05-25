package org.jtwig.functions.impl.list;

import org.jtwig.exceptions.CalculationException;
import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import org.jtwig.util.FunctionValueUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SliceFunction extends SimpleJtwigFunction {

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Object slice(FunctionRequest request, int begin, int length) throws CalculationException {
        Object input = request.get(0);
        if (input instanceof String) {
            String value = (String) input;
            if (value.length() < begin) {
                return "";
            } else {
                return value.substring(begin, Math.min(value.length(), begin + length));
            }
        }
        Iterator<Object> iterator = FunctionValueUtils.getCollection(request, 0).iterator();
        List<Object> list = new ArrayList<>();
        int i = 0;
        while (iterator.hasNext()) {
            if (i >= begin && i < begin + length)
                list.add(iterator.next());
            else
                iterator.next();
            i++;
        }
        return list;
    }
}
