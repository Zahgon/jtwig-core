package org.jtwig.functions.impl.list;

import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import org.jtwig.util.FunctionValueUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static org.jtwig.util.FunctionValueUtils.getNumber;

public class BatchFunction extends SimpleJtwigFunction {

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private List<List<Object>> batch(FunctionRequest request, int index, int groupSize) {
        Iterator<Object> iterator = FunctionValueUtils.getCollection(request, index).iterator();
        List<List<Object>> result = new ArrayList<>();
        while (iterator.hasNext()) {
            List<Object> batch = new ArrayList<>();
            for (int i = 0; i < groupSize; i++) {
                if (iterator.hasNext())
                    batch.add(iterator.next());
            }
            result.add(batch);
        }
        return result;
    }

    public List<List<Object>> batch(FunctionRequest request, int index, int groupSize, Object padding) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
