package org.jtwig.render.expression.calculator;

import org.jtwig.exceptions.ResolveValueException;
import org.jtwig.model.expression.VariableExpression;
import org.jtwig.render.RenderRequest;
import org.jtwig.util.ErrorMessageFormatter;
import org.jtwig.value.Undefined;
import org.jtwig.value.context.ValueContext;

public class VariableExpressionCalculator implements ExpressionCalculator<VariableExpression> {

    @Override
    public Object calculate(RenderRequest request, VariableExpression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
