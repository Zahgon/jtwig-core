package org.jtwig.model.tree.include;

import org.jtwig.model.expression.Expression;

public class IncludeConfiguration {

    private final boolean inheritModel;

    private final boolean ignoreMissing;

    private final Expression include;

    private final Expression map;

    public IncludeConfiguration(Expression include, Expression map, boolean inheritModel, boolean ignoreMissing) {
        this.inheritModel = inheritModel;
        this.ignoreMissing = ignoreMissing;
        this.include = include;
        this.map = map;
    }

    public boolean isInheritModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isIgnoreMissing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Expression getInclude() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Expression getMap() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
