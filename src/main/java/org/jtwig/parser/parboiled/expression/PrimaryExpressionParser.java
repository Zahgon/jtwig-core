package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.Expression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.parboiled.Rule;

public class PrimaryExpressionParser extends ExpressionParser<Expression> {

    public PrimaryExpressionParser(ParserContext context) {
        super(PrimaryExpressionParser.class, context);
    }

    @Override
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Rule ParenthesisRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
