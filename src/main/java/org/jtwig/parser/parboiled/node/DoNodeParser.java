package org.jtwig.parser.parboiled.node;

import org.jtwig.model.tree.DoNode;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.parser.parboiled.base.LimitsParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.expression.AnyExpressionParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;

public class DoNodeParser extends NodeParser<DoNode> {

    public DoNodeParser(ParserContext context) {
        super(DoNodeParser.class, context);
    }

    @Override
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
