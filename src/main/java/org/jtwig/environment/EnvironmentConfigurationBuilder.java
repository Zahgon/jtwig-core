package org.jtwig.environment;

import org.apache.commons.lang3.builder.Builder;
import org.jtwig.environment.and.*;
import org.jtwig.environment.initializer.EnvironmentInitializer;
import org.jtwig.extension.Extension;
import org.jtwig.functions.JtwigFunction;
import org.jtwig.render.expression.calculator.enumerated.EnumerationListStrategy;
import org.jtwig.util.builder.ListBuilder;
import org.jtwig.util.builder.MapBuilder;

public class EnvironmentConfigurationBuilder implements Builder<EnvironmentConfiguration> {

    public static EnvironmentConfigurationBuilder configuration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final MapBuilder<EnvironmentConfigurationBuilder, String, Object> parameters;

    private final ListBuilder<EnvironmentConfigurationBuilder, Extension> extensions;

    private final ListBuilder<EnvironmentConfigurationBuilder, JtwigFunction> functions;

    private final ListBuilder<EnvironmentConfigurationBuilder, EnumerationListStrategy> enumerationListStrategies;

    private final ListBuilder<EnvironmentConfigurationBuilder, EnvironmentInitializer> initializers;

    private final AndRenderConfigurationBuilder renderConfiguration;

    private final AndJtwigParserConfigurationBuilder jtwigParserConfigurationBuilder;

    private final AndResourceConfigurationBuilder resourceConfigurationBuilder;

    private final AndValueConfigurationBuilder valueConfigurationBuilder;

    private final AndEscapeEngineConfigurationBuilder escapeEngineConfigurationBuilder;

    private final AndPropertyResolverConfigurationBuilder propertyResolverConfigurationBuilder;

    public EnvironmentConfigurationBuilder() {
        functions = new ListBuilder<>(this);
        renderConfiguration = new AndRenderConfigurationBuilder(this);
        jtwigParserConfigurationBuilder = new AndJtwigParserConfigurationBuilder(this);
        resourceConfigurationBuilder = new AndResourceConfigurationBuilder(this);
        escapeEngineConfigurationBuilder = new AndEscapeEngineConfigurationBuilder(this);
        propertyResolverConfigurationBuilder = new AndPropertyResolverConfigurationBuilder(this);
        enumerationListStrategies = new ListBuilder<>(this);
        valueConfigurationBuilder = new AndValueConfigurationBuilder(this);
        extensions = new ListBuilder<>(this);
        parameters = new MapBuilder<>(this);
        initializers = new ListBuilder<>(this);
    }

    public EnvironmentConfigurationBuilder(EnvironmentConfiguration prototype) {
        functions = new ListBuilder<>(this, prototype.getFunctions());
        renderConfiguration = new AndRenderConfigurationBuilder(prototype.getRenderConfiguration(), this);
        jtwigParserConfigurationBuilder = new AndJtwigParserConfigurationBuilder(prototype.getJtwigParserConfiguration(), this);
        resourceConfigurationBuilder = new AndResourceConfigurationBuilder(prototype.getResourceConfiguration(), this);
        escapeEngineConfigurationBuilder = new AndEscapeEngineConfigurationBuilder(prototype.getEscapeConfiguration(), this);
        propertyResolverConfigurationBuilder = new AndPropertyResolverConfigurationBuilder(prototype.getPropertyResolverConfiguration(), this);
        enumerationListStrategies = new ListBuilder<>(this, prototype.getEnumerationStrategies());
        valueConfigurationBuilder = new AndValueConfigurationBuilder(prototype.getValueConfiguration(), this);
        extensions = new ListBuilder<>(this, prototype.getExtensions());
        parameters = new MapBuilder<>(this, prototype.getParameters());
        initializers = new ListBuilder<>(this, prototype.getInitializers());
    }

    @Override
    public EnvironmentConfiguration build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public AndJtwigParserConfigurationBuilder parser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ListBuilder<EnvironmentConfigurationBuilder, JtwigFunction> functions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public AndRenderConfigurationBuilder render() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public AndResourceConfigurationBuilder resources() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public AndPropertyResolverConfigurationBuilder propertyResolver() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public AndValueConfigurationBuilder value() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public AndEscapeEngineConfigurationBuilder escape() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ListBuilder<EnvironmentConfigurationBuilder, EnumerationListStrategy> enumerationStrategies() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ListBuilder<EnvironmentConfigurationBuilder, EnvironmentInitializer> initializers() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MapBuilder<EnvironmentConfigurationBuilder, String, Object> parameters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ListBuilder<EnvironmentConfigurationBuilder, Extension> extensions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
