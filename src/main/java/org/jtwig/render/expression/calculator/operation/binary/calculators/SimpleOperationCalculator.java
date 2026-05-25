package org.jtwig.render.expression.calculator.operation.binary.calculators;

import org.jtwig.render.expression.CalculateExpressionService;

public class SimpleOperationCalculator implements BinaryOperationCalculator {

    private final SimpleBinaryOperationCalculator simpleBinaryOperationCalculator;

    public SimpleOperationCalculator(SimpleBinaryOperationCalculator simpleBinaryOperationCalculator) {
        this.simpleBinaryOperationCalculator = simpleBinaryOperationCalculator;
    }

    @Override
    public Object calculate(Request request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
