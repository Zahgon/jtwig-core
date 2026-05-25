package org.jtwig.model.expression;

import org.jtwig.model.expression.test.TestExpression;
import org.jtwig.model.position.Position;

public class TestOperationExpression extends Expression {

    private final Expression argument;

    private final TestExpression testExpression;

    public TestOperationExpression(Position position, Expression argument, TestExpression testExpression) {
        super(position);
        this.argument = argument;
        this.testExpression = testExpression;
    }

    public Expression getArgument() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public TestExpression getTestExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
