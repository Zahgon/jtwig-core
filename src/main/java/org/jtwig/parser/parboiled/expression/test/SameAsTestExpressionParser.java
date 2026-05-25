package org.jtwig.parser.parboiled.expression.test;

import org.jtwig.model.expression.test.SameAsTestExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.expression.AnyExpressionParser;
import org.parboiled.Rule;

public class SameAsTestExpressionParser extends TestExpressionParser<SameAsTestExpression> {

    public SameAsTestExpressionParser(ParserContext context) {
        super(SameAsTestExpressionParser.class, context);
    }

    @Override
    public Rule Test() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
