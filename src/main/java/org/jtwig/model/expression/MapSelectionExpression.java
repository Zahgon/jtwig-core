package org.jtwig.model.expression;

import org.jtwig.model.position.Position;

public class MapSelectionExpression extends Expression {

    private final Expression mapExpression;

    private final Expression selectValue;

    public MapSelectionExpression(Position position, Expression mapExpression, Expression selectValue) {
        super(position);
        this.mapExpression = mapExpression;
        this.selectValue = selectValue;
    }

    public Expression getMapExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Expression getSelectValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
