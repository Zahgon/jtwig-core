package org.jtwig.parser.parboiled.base;

import org.jtwig.parser.config.SyntaxConfiguration;
import org.jtwig.parser.parboiled.ParserContext;
import org.parboiled.Rule;

public class SpacingParser extends BasicParser<Object> {

    public SpacingParser(ParserContext context) {
        super(SpacingParser.class, context);
    }

    public Rule Spacing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule Mandatory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
