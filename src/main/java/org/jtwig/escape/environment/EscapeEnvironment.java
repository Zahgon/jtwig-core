package org.jtwig.escape.environment;

import org.jtwig.escape.EscapeEngine;
import org.jtwig.escape.EscapeEngineSelector;

public class EscapeEnvironment {

    private final EscapeEngine initialEscapeEngine;

    private final String defaultEscapeEngine;

    private final EscapeEngineSelector escapeEngineSelector;

    public EscapeEnvironment(EscapeEngine initialEscapeEngine, String defaultEscapeEngine, EscapeEngineSelector escapeEngineSelector) {
        this.initialEscapeEngine = initialEscapeEngine;
        this.defaultEscapeEngine = defaultEscapeEngine;
        this.escapeEngineSelector = escapeEngineSelector;
    }

    public EscapeEngine getInitialEscapeEngine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDefaultEscapeEngine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EscapeEngineSelector getEscapeEngineSelector() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
