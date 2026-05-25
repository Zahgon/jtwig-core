package org.jtwig.parser.parboiled.expression.test;

import org.jtwig.model.expression.test.DivisibleByTestExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.expression.AnyExpressionParser;
import org.parboiled.Rule;

public class DivisibleByTestExpressionParser extends TestExpressionParser<DivisibleByTestExpression> {

    public DivisibleByTestExpressionParser(ParserContext context) {
        super(DivisibleByTestExpressionParser.class, context);
    }

    @Override
    public Rule Test() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
