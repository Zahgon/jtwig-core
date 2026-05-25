package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.EnumeratedListExpression;
import org.jtwig.model.expression.Expression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.BasicParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.parboiled.Rule;
import org.parboiled.annotations.Label;
import java.util.ArrayList;
import java.util.Collection;
import static org.parboiled.Parboiled.createParser;

public class EnumerationListExpressionParser extends ExpressionParser<EnumeratedListExpression> {

    public EnumerationListExpressionParser(ParserContext context) {
        super(EnumerationListExpressionParser.class, context);
        createParser(MultipleExpressionsParser.class, context);
    }

    @Override
    @Label("List Enumeration")
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class MultipleExpressionsParser extends BasicParser<Collection<Expression>> {

        public MultipleExpressionsParser(ParserContext context) {
            super(MultipleExpressionsParser.class, context);
        }

        public Rule Rule() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
