package org.jtwig.render.expression.calculator.operation.binary.calculators;

import org.jtwig.render.RenderRequest;
import java.math.BigDecimal;
import java.math.MathContext;

public class DivideOperationCalculator implements SimpleBinaryMathCalculator {

    @Override
    public BigDecimal calculate(RenderRequest request, BigDecimal left, BigDecimal right) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
