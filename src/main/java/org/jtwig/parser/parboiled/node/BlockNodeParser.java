package org.jtwig.parser.parboiled.node;

import org.jtwig.model.expression.VariableExpression;
import org.jtwig.model.tree.BlockNode;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.parser.parboiled.base.LimitsParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.expression.VariableExpressionParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;

public class BlockNodeParser extends NodeParser<BlockNode> {

    public BlockNodeParser(ParserContext context) {
        super(BlockNodeParser.class, context);
    }

    @Override
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean throwExceptionIfNonSameVariableName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
