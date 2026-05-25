package org.jtwig.parser.parboiled.node;

import org.jtwig.model.tree.OutputNode;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.LimitsParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.expression.AnyExpressionParser;
import org.parboiled.Rule;

public class OutputNodeParser extends NodeParser<OutputNode> {

    public OutputNodeParser(ParserContext context) {
        super(OutputNodeParser.class, context);
    }

    @Override
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
