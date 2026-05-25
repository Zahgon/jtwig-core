package org.jtwig.render.expression;

import com.google.common.base.Optional;
import org.jtwig.model.expression.Expression;
import org.jtwig.render.expression.calculator.ExpressionCalculator;
import org.jtwig.util.ErrorMessageFormatter;
import java.util.Map;

public class ExpressionCalculatorSelector {

    private final Map<Class<? extends Expression>, ExpressionCalculator> expressionCalculatorMap;

    public ExpressionCalculatorSelector(Map<Class<? extends Expression>, ExpressionCalculator> expressionCalculatorMap) {
        this.expressionCalculatorMap = expressionCalculatorMap;
    }

    public ExpressionCalculator calculatorFor(Expression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
