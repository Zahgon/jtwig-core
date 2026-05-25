package org.jtwig.render.expression.calculator;

import org.jtwig.model.expression.Expression;
import org.jtwig.model.expression.MapExpression;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.expression.CalculateExpressionService;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExpressionCalculator implements ExpressionCalculator<MapExpression> {

    @Override
    public Object calculate(RenderRequest request, MapExpression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
