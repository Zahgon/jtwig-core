package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.MapSelectionExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.parboiled.Rule;
import org.parboiled.annotations.Label;

public class MapSelectionExpressionParser extends ExpressionParser<MapSelectionExpression> {

    public MapSelectionExpressionParser(ParserContext context) {
        super(MapSelectionExpressionParser.class, context);
    }

    @Override
    @Label("MapSelection Expression")
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule MapSelectionExpressionTrail() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
