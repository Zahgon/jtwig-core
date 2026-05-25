package org.jtwig.escape.config;

import org.apache.commons.lang3.builder.Builder;
import org.jtwig.escape.EscapeEngine;
import org.jtwig.util.builder.MapBuilder;

public class EscapeEngineConfigurationBuilder<B extends EscapeEngineConfigurationBuilder> implements Builder<EscapeEngineConfiguration> {

    private String initialEngine;

    private String defaultEngine;

    private MapBuilder<B, String, EscapeEngine> escapeEngineMap;

    public EscapeEngineConfigurationBuilder(EscapeEngineConfiguration prototype) {
        this.escapeEngineMap = new MapBuilder<>(self(), prototype.getEscapeEngineMap());
        this.initialEngine = prototype.getInitialEngine();
        this.defaultEngine = prototype.getDefaultEngine();
    }

    public EscapeEngineConfigurationBuilder() {
        this.escapeEngineMap = new MapBuilder<>(self());
    }

    public B withInitialEngine(String initialEngine) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public B withDefaultEngine(String defaultEngine) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private B self() {
        return (B) this;
    }

    public MapBuilder<B, String, EscapeEngine> engines() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public EscapeEngineConfiguration build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
