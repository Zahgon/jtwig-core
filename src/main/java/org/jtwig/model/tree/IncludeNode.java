package org.jtwig.model.tree;

import org.jtwig.model.expression.Expression;
import org.jtwig.model.position.Position;
import org.jtwig.model.tree.include.IncludeConfiguration;

public class IncludeNode extends Node {

    private final IncludeConfiguration configuration;

    public IncludeNode(Position position, IncludeConfiguration configuration) {
        super(position);
        this.configuration = configuration;
    }

    public Expression getMapExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isInheritModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isIgnoreMissing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Expression getResourceExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
