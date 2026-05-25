package org.jtwig.escape.config;

import org.jtwig.escape.EscapeEngine;
import java.util.Map;

public class EscapeEngineConfiguration {

    private final String initialEngine;

    private final String defaultEngine;

    private final Map<String, EscapeEngine> escapeEngineMap;

    public EscapeEngineConfiguration(String initialEngine, String defaultEngine, Map<String, EscapeEngine> escapeEngineMap) {
        this.initialEngine = initialEngine;
        this.defaultEngine = defaultEngine;
        this.escapeEngineMap = escapeEngineMap;
    }

    public String getInitialEngine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDefaultEngine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, EscapeEngine> getEscapeEngineMap() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
