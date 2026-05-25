package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.UnaryOperationExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.expression.operator.UnaryOperatorParser;
import org.parboiled.Rule;

public class UnaryOperationExpressionParser extends ExpressionParser<UnaryOperationExpression> {

    public UnaryOperationExpressionParser(ParserContext context) {
        super(UnaryOperationExpressionParser.class, context);
    }

    @Override
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
