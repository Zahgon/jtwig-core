package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.Expression;
import org.jtwig.parser.parboiled.ParserContext;
import org.parboiled.Rule;
import org.parboiled.annotations.Label;

public class SimpleExpressionParser extends ExpressionParser<Expression> {

    public SimpleExpressionParser(ParserContext context) {
        super(SimpleExpressionParser.class, context);
    }

    @Override
    @Label("Simple Expression")
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
