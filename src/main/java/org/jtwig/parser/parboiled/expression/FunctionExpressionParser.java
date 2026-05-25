package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.Expression;
import org.jtwig.model.expression.FunctionExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.BasicParser;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;
import java.util.ArrayList;
import java.util.List;
import static org.parboiled.Parboiled.createParser;

public class FunctionExpressionParser extends ExpressionParser<FunctionExpression> {

    public FunctionExpressionParser(ParserContext context) {
        super(FunctionExpressionParser.class, context);
        createParser(ArgumentsParser.class, context);
        createParser(FunctionNameParser.class, context);
    }

    @Override
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class FunctionNameParser extends BasicParser<String> {

        public FunctionNameParser(ParserContext context) {
            super(FunctionNameParser.class, context);
        }

        public Rule Name() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class ArgumentsParser extends BasicParser<List<Expression>> {

        public ArgumentsParser(ParserContext context) {
            super(ArgumentsParser.class, context);
        }

        public Rule Arguments() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        Rule ArgumentExpression() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        Rule ArgumentPrimaryExpression() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
