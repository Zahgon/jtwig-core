package org.jtwig.model.tree;

import org.jtwig.model.expression.Expression;
import org.jtwig.model.expression.VariableExpression;
import org.jtwig.model.position.Position;

public class SetNode extends Node {

    private final VariableExpression variableExpression;

    private final Expression expression;

    public SetNode(Position position, VariableExpression variableExpression, Expression expression) {
        super(position);
        this.variableExpression = variableExpression;
        this.expression = expression;
    }

    public VariableExpression getVariableExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Expression getExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
