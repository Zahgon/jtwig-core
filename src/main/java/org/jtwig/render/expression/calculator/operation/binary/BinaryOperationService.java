package org.jtwig.render.expression.calculator.operation.binary;

import com.google.common.base.Optional;
import org.jtwig.model.expression.BinaryOperationExpression;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.expression.calculator.operation.binary.calculators.BinaryOperationCalculator;
import org.jtwig.util.ErrorMessageFormatter;

public class BinaryOperationService {

    private final BinaryOperationCalculatorSelector binaryOperationCalculatorSelector;

    public BinaryOperationService(BinaryOperationCalculatorSelector binaryOperationCalculatorSelector) {
        this.binaryOperationCalculatorSelector = binaryOperationCalculatorSelector;
    }

    public Object calculate(RenderRequest request, BinaryOperationExpression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
