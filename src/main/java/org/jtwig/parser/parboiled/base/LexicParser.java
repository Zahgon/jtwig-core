package org.jtwig.parser.parboiled.base;

import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;
import org.parboiled.annotations.Label;
import java.util.Collection;

public class LexicParser extends BasicParser<String> {

    final Collection<String> extraKeywords;

    Rule[] keywordRules = null;

    LexicParser(ParserContext context, Collection<String> extraKeywords) {
        super(LexicParser.class, context);
        this.extraKeywords = extraKeywords;
    }

    public Rule Identifier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Label("Keywork")
    public Rule Keyword(Keyword keyword) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Label("Keywork")
    public Rule Keyword(String keyword) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Rule Keyword() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Rule[] keywordRules() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule Letter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule LetterOrDigit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
