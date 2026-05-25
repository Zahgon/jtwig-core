package org.jtwig.parser.parboiled.expression.test;

import org.jtwig.model.expression.test.NullTestExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;

public class NullTestExpressionParser extends TestExpressionParser<NullTestExpression> {

    public NullTestExpressionParser(ParserContext context) {
        super(NullTestExpressionParser.class, context);
    }

    @Override
    public Rule Test() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
