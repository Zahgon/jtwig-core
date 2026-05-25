package org.jtwig.parser.parboiled.node;

import org.jtwig.model.expression.InjectableExpression;
import org.jtwig.model.tree.FilterNode;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.parser.parboiled.base.LimitsParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.expression.BinaryOperationExpressionParser;
import org.jtwig.parser.parboiled.expression.ExpressionParser;
import org.jtwig.parser.parboiled.expression.FunctionExpressionParser;
import org.jtwig.parser.parboiled.expression.VariableExpressionParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;
import static org.parboiled.Parboiled.createParser;

public class FilterNodeParser extends NodeParser<FilterNode> {

    public FilterNodeParser(ParserContext context) {
        super(FilterNodeParser.class, context);
        createParser(FilterExpressionParser.class, context);
    }

    @Override
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class FilterExpressionParser extends ExpressionParser<InjectableExpression> {

        public FilterExpressionParser(ParserContext context) {
            super(FilterExpressionParser.class, context);
        }

        @Override
        public Rule ExpressionRule() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
