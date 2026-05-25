package org.jtwig.environment;

import org.jtwig.environment.initializer.EnvironmentInitializer;
import org.jtwig.escape.config.EscapeEngineConfiguration;
import org.jtwig.extension.Extension;
import org.jtwig.functions.JtwigFunction;
import org.jtwig.parser.config.JtwigParserConfiguration;
import org.jtwig.property.configuration.PropertyResolverConfiguration;
import org.jtwig.render.config.RenderConfiguration;
import org.jtwig.render.expression.calculator.enumerated.EnumerationListStrategy;
import org.jtwig.resource.config.ResourceConfiguration;
import org.jtwig.value.config.ValueConfiguration;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnvironmentConfiguration {

    private final ResourceConfiguration resourceConfiguration;

    private final JtwigParserConfiguration jtwigParserConfiguration;

    private final RenderConfiguration renderConfiguration;

    private final ValueConfiguration valueConfiguration;

    private final EscapeEngineConfiguration escapeConfiguration;

    private final PropertyResolverConfiguration propertyResolverConfiguration;

    private final Collection<EnumerationListStrategy> enumerationStrategies;

    private final Collection<JtwigFunction> functions;

    private final Map<String, Object> parameters = new HashMap<>();

    private final Collection<Extension> extensions;

    private final List<EnvironmentInitializer> initializers;

    public EnvironmentConfiguration(ResourceConfiguration resourceConfiguration, Collection<EnumerationListStrategy> enumerationStrategies, JtwigParserConfiguration jtwigParserConfiguration, ValueConfiguration valueConfiguration, RenderConfiguration renderConfiguration, EscapeEngineConfiguration escapeConfiguration, PropertyResolverConfiguration propertyResolverConfiguration, Collection<JtwigFunction> functions, Map<String, Object> parameters, Collection<Extension> extensions, List<EnvironmentInitializer> initializers) {
        this.resourceConfiguration = resourceConfiguration;
        this.escapeConfiguration = escapeConfiguration;
        this.enumerationStrategies = enumerationStrategies;
        this.jtwigParserConfiguration = jtwigParserConfiguration;
        this.valueConfiguration = valueConfiguration;
        this.renderConfiguration = renderConfiguration;
        this.propertyResolverConfiguration = propertyResolverConfiguration;
        this.functions = functions;
        this.extensions = extensions;
        this.initializers = initializers;
        this.parameters.putAll(parameters);
    }

    public ResourceConfiguration getResourceConfiguration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, Object> getParameters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<JtwigFunction> getFunctions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public PropertyResolverConfiguration getPropertyResolverConfiguration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<EnumerationListStrategy> getEnumerationStrategies() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ValueConfiguration getValueConfiguration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public JtwigParserConfiguration getJtwigParserConfiguration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RenderConfiguration getRenderConfiguration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<Extension> getExtensions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EscapeEngineConfiguration getEscapeConfiguration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<EnvironmentInitializer> getInitializers() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
