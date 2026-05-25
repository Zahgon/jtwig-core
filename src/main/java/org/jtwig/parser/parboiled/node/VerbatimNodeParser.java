package org.jtwig.parser.parboiled.node;

import org.jtwig.model.tree.VerbatimNode;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.*;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;
import static org.parboiled.Parboiled.createParser;

public class VerbatimNodeParser extends NodeParser<VerbatimNode> {

    public VerbatimNodeParser(ParserContext context) {
        super(VerbatimNodeParser.class, context);
        createParser(VerbatimContentParser.class, context);
    }

    @Override
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Rule endVerbatim(LimitsParser limitsParser, SpacingParser spacingParser, LexicParser lexicParser) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class VerbatimContentParser extends BasicParser<String> {

        public VerbatimContentParser(ParserContext context) {
            super(VerbatimContentParser.class, context);
        }

        public Rule Content(Rule end) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
