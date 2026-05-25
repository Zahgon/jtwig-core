package org.jtwig.parser.parboiled.node;

import org.jtwig.model.tree.FlushNode;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.parser.parboiled.base.LimitsParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;

public class FlushNodeParser extends NodeParser<FlushNode> {

    public FlushNodeParser(ParserContext context) {
        super(FlushNodeParser.class, context);
    }

    @Override
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
