package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.TestOperationExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.expression.test.AnyTestExpressionParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;
import org.parboiled.annotations.Label;

public class TestOperationExpressionParser extends ExpressionParser<TestOperationExpression> {

    public TestOperationExpressionParser(ParserContext context) {
        super(TestOperationExpressionParser.class, context);
    }

    @Override
    @Label("Test Operation")
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
