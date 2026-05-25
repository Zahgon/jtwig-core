package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.ConstantExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.BasicParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.parboiled.Rule;
import java.math.BigDecimal;
import static org.parboiled.Parboiled.createParser;

public class NumberExpressionParser extends ExpressionParser<ConstantExpression> {

    public NumberExpressionParser(ParserContext context) {
        super(NumberExpressionParser.class, context);
        createParser(NumberParser.class, context);
    }

    @Override
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class NumberParser extends BasicParser<BigDecimal> {

        public NumberParser(ParserContext context) {
            super(NumberParser.class, context);
        }

        // [0-9]+(?:\.[0-9]+)?
        public Rule NumberRule() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
