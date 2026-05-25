package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.ComprehensionListExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.parboiled.Rule;
import org.parboiled.annotations.Label;

public class ComprehensionListExpressionParser extends ExpressionParser<ComprehensionListExpression> {

    public ComprehensionListExpressionParser(ParserContext context) {
        super(ComprehensionListExpressionParser.class, context);
    }

    @Override
    @Label("Comprehension List")
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
