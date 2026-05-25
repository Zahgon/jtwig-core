package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.ConstantExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.parboiled.Rule;

public class ConstantExpressionParser extends ExpressionParser<ConstantExpression> {

    public ConstantExpressionParser(ParserContext context) {
        super(ConstantExpressionParser.class, context);
    }

    @Override
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
