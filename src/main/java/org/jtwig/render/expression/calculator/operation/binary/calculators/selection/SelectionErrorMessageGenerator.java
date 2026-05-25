package org.jtwig.render.expression.calculator.operation.binary.calculators.selection;

import com.google.common.base.Optional;
import org.jtwig.model.expression.ConstantExpression;
import org.jtwig.model.expression.Expression;
import org.jtwig.model.expression.FunctionExpression;
import org.jtwig.model.expression.VariableExpression;

public class SelectionErrorMessageGenerator {

    public String explain(Expression leftOperand, Expression rightOperand) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Optional<String> getName(Expression expression) {
        if (expression instanceof VariableExpression) {
            return Optional.of(((VariableExpression) expression).getIdentifier());
        }
        if (expression instanceof FunctionExpression) {
            return Optional.of(((FunctionExpression) expression).getFunctionIdentifier());
        }
        if (expression instanceof ConstantExpression) {
            return Optional.of(String.valueOf(((ConstantExpression) expression).getConstantValue()));
        }
        return Optional.absent();
    }
}
