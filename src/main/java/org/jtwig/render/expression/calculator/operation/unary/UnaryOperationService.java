package org.jtwig.render.expression.calculator.operation.unary;

import com.google.common.base.Optional;
import org.jtwig.exceptions.CalculationException;
import org.jtwig.model.expression.UnaryOperationExpression;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.expression.calculator.operation.unary.calculators.UnaryOperationCalculator;
import org.jtwig.util.ErrorMessageFormatter;

public class UnaryOperationService {

    private final UnaryOperationCalculatorSelector unaryOperationCalculatorSelector;

    public UnaryOperationService(UnaryOperationCalculatorSelector unaryOperationCalculatorSelector) {
        this.unaryOperationCalculatorSelector = unaryOperationCalculatorSelector;
    }

    public Object calculate(RenderRequest request, UnaryOperationExpression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
