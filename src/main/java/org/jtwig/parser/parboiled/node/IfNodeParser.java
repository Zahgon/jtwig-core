package org.jtwig.parser.parboiled.node;

import org.jtwig.model.expression.ConstantExpression;
import org.jtwig.model.tree.IfNode;
import org.jtwig.model.tree.IfNode.IfConditionNode;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.*;
import org.jtwig.parser.parboiled.expression.AnyExpressionParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;
import java.util.ArrayList;
import java.util.Collection;
import static org.parboiled.Parboiled.createParser;

public class IfNodeParser extends NodeParser<IfNode> {

    public IfNodeParser(ParserContext context) {
        super(IfNodeParser.class, context);
        createParser(IfConditionNodeParser.class, context);
    }

    @Override
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class IfConditionNodeParser extends BasicParser<Collection<IfConditionNode>> {

        public IfConditionNodeParser(ParserContext context) {
            super(IfConditionNodeParser.class, context);
        }

        Rule NodeRule() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Rule ifConditionExpression(LimitsParser limitsParser, SpacingParser spacingParser, AnyExpressionParser anyExpressionParser) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        Rule elseIfCondition() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        Rule elseCondition() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
