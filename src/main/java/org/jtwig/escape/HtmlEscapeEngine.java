package org.jtwig.escape;

import org.apache.commons.lang3.StringEscapeUtils;

public class HtmlEscapeEngine implements EscapeEngine {

    private static final HtmlEscapeEngine instance = new HtmlEscapeEngine();

    public static HtmlEscapeEngine instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private HtmlEscapeEngine() {
    }

    @Override
    public String escape(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
