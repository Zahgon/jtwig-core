package org.jtwig.model.tree;

import com.google.common.base.Optional;
import org.jtwig.model.expression.Expression;
import org.jtwig.model.expression.VariableExpression;
import org.jtwig.model.position.Position;

public class ForLoopNode extends ContentNode {

    private final Optional<VariableExpression> keyVariableExpression;

    private final VariableExpression variableExpression;

    private final Expression expression;

    public ForLoopNode(Position position, VariableExpression keyVariableExpression, VariableExpression variableExpression, Expression expression, Node content) {
        super(position, content);
        if (variableExpression == null) {
            this.variableExpression = keyVariableExpression;
            this.keyVariableExpression = Optional.absent();
        } else {
            this.keyVariableExpression = Optional.of(keyVariableExpression);
            this.variableExpression = variableExpression;
        }
        this.expression = expression;
    }

    public VariableExpression getVariableExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Expression getExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<VariableExpression> getKeyVariableExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
