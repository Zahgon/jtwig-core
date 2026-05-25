package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.VariableExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.parboiled.Rule;

public class VariableExpressionParser extends ExpressionParser<VariableExpression> {

    public VariableExpressionParser(ParserContext context) {
        super(VariableExpressionParser.class, context);
    }

    @Override
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
