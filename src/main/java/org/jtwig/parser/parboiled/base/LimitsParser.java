package org.jtwig.parser.parboiled.base;

import org.jtwig.model.tree.TextNode;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.model.LimitProperties;
import org.parboiled.Rule;
import org.parboiled.annotations.Label;

public class LimitsParser extends BasicParser<LimitProperties> {

    boolean whiteSpace = false;

    TextNode update = null;

    public LimitsParser(ParserContext context) {
        super(LimitsParser.class, context);
    }

    public Rule startComment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule endComment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule startOutput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule endOutput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Label("Start Code Island")
    public Rule startCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Label("End Code Island")
    public Rule endCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Rule LimitProperty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean markWhiteSpace(boolean whiteSpace) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule anyEnd() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean lastWhiteSpace() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean update(TextNode update) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
