package org.jtwig.resource.config;

import org.apache.commons.lang3.builder.Builder;
import org.jtwig.resource.loader.TypedResourceLoader;
import org.jtwig.resource.reference.ResourceReferenceExtractor;
import org.jtwig.resource.resolver.RelativeResourceResolver;
import org.jtwig.util.builder.ListBuilder;
import java.nio.charset.Charset;

public class ResourceConfigurationBuilder<B extends ResourceConfigurationBuilder> implements Builder<ResourceConfiguration> {

    private final ListBuilder<B, RelativeResourceResolver> resourceResolvers;

    private final ListBuilder<B, TypedResourceLoader> resourceLoaders;

    private final ListBuilder<B, String> absoluteResourceTypes;

    private ResourceReferenceExtractor resourceReferenceExtractor;

    private Charset defaultInputCharset;

    public ResourceConfigurationBuilder() {
        this.resourceResolvers = new ListBuilder<>(self());
        this.resourceLoaders = new ListBuilder<>(self());
        this.absoluteResourceTypes = new ListBuilder<>(self());
    }

    public ResourceConfigurationBuilder(ResourceConfiguration prototype) {
        this.resourceResolvers = new ListBuilder<>(self(), prototype.getRelativeResourceResolvers());
        this.resourceLoaders = new ListBuilder<>(self(), prototype.getResourceLoaders());
        this.absoluteResourceTypes = new ListBuilder<>(self(), prototype.getAbsoluteResourceTypes());
        this.defaultInputCharset = prototype.getDefaultCharset();
        this.resourceReferenceExtractor = prototype.getResourceReferenceExtractor();
    }

    public B withDefaultInputCharset(Charset defaultInputCharset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public B withResourceReferenceExtractor(ResourceReferenceExtractor extractor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ListBuilder<B, RelativeResourceResolver> relativeResourceResolvers() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ListBuilder<B, TypedResourceLoader> resourceLoaders() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ListBuilder<B, String> absoluteResourceTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private B self() {
        return (B) this;
    }

    @Override
    public ResourceConfiguration build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
