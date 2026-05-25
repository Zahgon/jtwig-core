package org.jtwig.render.expression.calculator;

import org.jtwig.model.expression.TernaryOperationExpression;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.expression.CalculateExpressionService;
import org.jtwig.value.convert.Converter;

public class TernaryExpressionCalculator implements ExpressionCalculator<TernaryOperationExpression> {

    @Override
    public Object calculate(RenderRequest request, TernaryOperationExpression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
