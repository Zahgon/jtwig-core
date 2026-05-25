package org.jtwig.render.expression.test;

import com.google.common.base.Optional;
import org.jtwig.model.expression.Expression;
import org.jtwig.model.expression.test.TestExpression;
import org.jtwig.model.position.Position;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.expression.test.calculator.TestExpressionCalculator;
import org.jtwig.util.ErrorMessageFormatter;

public class CalculateTestExpressionService {

    private final TestExpressionCalculatorSelector selector;

    public CalculateTestExpressionService(TestExpressionCalculatorSelector selector) {
        this.selector = selector;
    }

    public Object calculate(RenderRequest request, Position position, TestExpression test, Expression argument) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
