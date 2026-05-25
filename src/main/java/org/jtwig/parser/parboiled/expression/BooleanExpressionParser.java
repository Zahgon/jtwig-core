package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.ConstantExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;

public class BooleanExpressionParser extends ExpressionParser<ConstantExpression> {

    public BooleanExpressionParser(ParserContext context) {
        super(BooleanExpressionParser.class, context);
    }

    @Override
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule TrueRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule FalseRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
