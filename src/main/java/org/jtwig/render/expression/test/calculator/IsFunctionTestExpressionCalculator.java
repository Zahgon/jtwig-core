package org.jtwig.render.expression.test.calculator;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import org.jtwig.functions.FunctionArguments;
import org.jtwig.model.expression.Expression;
import org.jtwig.model.expression.VariableExpression;
import org.jtwig.model.expression.test.IsFunctionTestExpression;
import org.jtwig.model.position.Position;
import org.jtwig.render.RenderRequest;

public class IsFunctionTestExpressionCalculator implements TestExpressionCalculator<IsFunctionTestExpression> {

    @Override
    public Object calculate(RenderRequest request, Position position, IsFunctionTestExpression test, Expression argument) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
