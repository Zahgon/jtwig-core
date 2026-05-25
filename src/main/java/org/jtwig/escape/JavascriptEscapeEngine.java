package org.jtwig.escape;

import org.apache.commons.lang3.StringEscapeUtils;

public class JavascriptEscapeEngine implements EscapeEngine {

    private static final JavascriptEscapeEngine instance = new JavascriptEscapeEngine();

    public static JavascriptEscapeEngine instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private JavascriptEscapeEngine() {
    }

    @Override
    public String escape(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
