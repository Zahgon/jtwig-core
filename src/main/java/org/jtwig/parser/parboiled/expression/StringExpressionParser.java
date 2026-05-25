package org.jtwig.parser.parboiled.expression;

import org.apache.commons.lang3.StringEscapeUtils;
import org.jtwig.model.expression.ConstantExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.BasicParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.parboiled.Rule;
import static org.parboiled.Parboiled.createParser;

public class StringExpressionParser extends ExpressionParser<ConstantExpression> {

    public StringExpressionParser(ParserContext context) {
        super(StringExpressionParser.class, context);
        createParser(StringParser.class, context);
    }

    @Override
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class StringParser extends BasicParser<StringBuilder> {

        public StringParser(ParserContext context) {
            super(StringParser.class, context);
        }

        public Rule StringRule() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        Rule StringWith(char start) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        Rule Others(char start) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        Rule Escape() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        boolean run(Object object) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
