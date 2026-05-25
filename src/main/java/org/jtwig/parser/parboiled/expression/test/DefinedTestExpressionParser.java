package org.jtwig.parser.parboiled.expression.test;

import org.jtwig.model.expression.test.DefinedTestExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.parboiled.Rule;

public class DefinedTestExpressionParser extends TestExpressionParser<DefinedTestExpression> {

    public DefinedTestExpressionParser(ParserContext context) {
        super(DefinedTestExpressionParser.class, context);
    }

    @Override
    public Rule Test() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
