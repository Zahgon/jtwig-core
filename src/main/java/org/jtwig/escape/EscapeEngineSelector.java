package org.jtwig.escape;

import com.google.common.base.Optional;
import org.apache.commons.lang3.StringUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EscapeEngineSelector {

    public static EscapeEngineSelector newInstance(Map<String, EscapeEngine> escapeEngineMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final Map<String, EscapeEngine> escapeEngineMap;

    private EscapeEngineSelector(Map<String, EscapeEngine> escapeEngineMap) {
        this.escapeEngineMap = escapeEngineMap;
    }

    public Optional<EscapeEngine> escapeEngineFor(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<String> availableEscapeEngines() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
