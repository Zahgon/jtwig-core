package org.jtwig.model.expression;

import org.jtwig.model.position.Position;
import java.util.ArrayList;
import java.util.List;

public class FunctionExpression extends InjectableExpression {

    private final String functionIdentifier;

    private final List<Expression> arguments;

    public FunctionExpression(Position position, String functionIdentifier, List<Expression> arguments) {
        super(position);
        this.functionIdentifier = functionIdentifier;
        this.arguments = arguments;
    }

    public String getFunctionIdentifier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Expression> getArguments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Expression inject(Expression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
