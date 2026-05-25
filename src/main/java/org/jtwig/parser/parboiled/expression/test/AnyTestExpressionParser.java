package org.jtwig.parser.parboiled.expression.test;

import org.jtwig.model.expression.test.NotTestExpression;
import org.jtwig.model.expression.test.TestExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.BasicParser;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;
import java.util.List;
import static org.parboiled.Parboiled.createParser;

public class AnyTestExpressionParser extends TestExpressionParser<TestExpression> {

    private final List<Class<? extends TestExpressionParser>> testExpressionParsers;

    public AnyTestExpressionParser(ParserContext context, List<Class<? extends TestExpressionParser>> testExpressionParsers) {
        super(AnyTestExpressionParser.class, context);
        this.testExpressionParsers = testExpressionParsers;
        createParser(NotParser.class, context);
    }

    @Override
    public Rule Test() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Rule[] rulesFor(TestExpressionParser[] parsers, NotParser notParser) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Rule ruleFor(TestExpressionParser parser, NotParser notParser) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class NotParser extends BasicParser<Boolean> {

        public NotParser(ParserContext context) {
            super(NotParser.class, context);
        }

        public Rule Rule() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
