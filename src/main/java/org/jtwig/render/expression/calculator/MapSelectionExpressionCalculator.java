package org.jtwig.render.expression.calculator;

import org.jtwig.exceptions.CalculationException;
import org.jtwig.model.expression.MapSelectionExpression;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.expression.CalculateExpressionService;
import org.jtwig.value.WrappedCollection;
import org.jtwig.value.convert.Converter;
import static org.jtwig.util.ErrorMessageFormatter.errorMessage;

public class MapSelectionExpressionCalculator implements ExpressionCalculator<MapSelectionExpression> {

    @Override
    public Object calculate(RenderRequest request, MapSelectionExpression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String getString(RenderRequest request, Object input) {
        return request.getEnvironment().getValueEnvironment().getStringConverter().convert(input);
    }
}
