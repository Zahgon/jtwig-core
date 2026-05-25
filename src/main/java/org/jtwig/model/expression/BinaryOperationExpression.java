package org.jtwig.model.expression;

import org.jtwig.exceptions.CalculationException;
import org.jtwig.model.position.Position;
import org.jtwig.render.expression.calculator.operation.binary.BinaryOperator;
import static org.jtwig.util.ErrorMessageFormatter.errorMessage;

public class BinaryOperationExpression extends InjectableExpression {

    private final Expression leftOperand;

    private final BinaryOperator binaryOperator;

    private final Expression rightOperand;

    public BinaryOperationExpression(Position position, Expression leftOperand, BinaryOperator binaryOperator, Expression rightOperand) {
        super(position);
        this.leftOperand = leftOperand;
        this.binaryOperator = binaryOperator;
        this.rightOperand = rightOperand;
    }

    public Expression getLeftOperand() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public BinaryOperator getBinaryOperator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Expression getRightOperand() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Expression inject(Expression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
