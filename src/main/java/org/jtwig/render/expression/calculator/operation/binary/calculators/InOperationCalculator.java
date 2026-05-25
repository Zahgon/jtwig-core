package org.jtwig.render.expression.calculator.operation.binary.calculators;

import org.jtwig.model.position.Position;
import org.jtwig.render.RenderRequest;
import org.jtwig.value.WrappedCollection;
import org.jtwig.value.convert.Converter;
import java.util.Iterator;
import java.util.Map;

public class InOperationCalculator implements SimpleBinaryOperationCalculator {

    @Override
    public Object calculate(RenderRequest request, Position position, Object left, Object right) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
