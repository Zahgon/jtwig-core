package org.jtwig.model.expression;

import org.jtwig.model.position.Position;
import java.util.Collections;

public class VariableExpression extends InjectableExpression {

    private final String identifier;

    public VariableExpression(Position position, String identifier) {
        super(position);
        this.identifier = identifier;
    }

    public String getIdentifier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Expression inject(Expression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
