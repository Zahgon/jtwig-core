package org.jtwig.render.expression.calculator;

import com.google.common.base.Optional;
import org.jtwig.exceptions.CalculationException;
import org.jtwig.model.expression.ComprehensionListExpression;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.expression.CalculateExpressionService;
import org.jtwig.render.expression.calculator.enumerated.EnumerationListStrategy;
import org.jtwig.util.ErrorMessageFormatter;
import java.util.List;

public class ComprehensionListExpressionCalculator implements ExpressionCalculator<ComprehensionListExpression> {

    @Override
    public Object calculate(RenderRequest request, ComprehensionListExpression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
