package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.TernaryOperationExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.parboiled.Rule;

public class TernaryOperationExpressionParser extends ExpressionParser<TernaryOperationExpression> {

    public TernaryOperationExpressionParser(ParserContext context) {
        super(TernaryOperationExpressionParser.class, context);
    }

    @Override
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
