package org.jtwig.parser.parboiled.base;

import org.jtwig.parser.ParseException;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.util.ErrorMessageFormatter;
import org.parboiled.BaseParser;
import org.parboiled.MatcherContext;
import org.parboiled.Rule;
import org.parboiled.errors.BasicParseError;
import java.util.List;

public class BasicParser<T> extends BaseParser<T> {

    final ParserContext parserContext;

    public BasicParser(Class<? extends BasicParser> type, ParserContext context) {
        this.parserContext = context;
        this.parserContext.register(type, this);
    }

    public ParserContext parserContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addError(String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule Mandatory(Rule rule, String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean throwException(String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
