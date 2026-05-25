package org.jtwig.resource.environment;

import org.jtwig.resource.ResourceService;
import org.jtwig.resource.reference.ResourceReferenceExtractor;
import java.nio.charset.Charset;

public class ResourceEnvironment {

    private final Charset defaultInputCharset;

    private final ResourceService resourceService;

    private final ResourceReferenceExtractor resourceReferenceExtractor;

    public ResourceEnvironment(Charset defaultInputCharset, ResourceService resourceService, ResourceReferenceExtractor extractor) {
        this.defaultInputCharset = defaultInputCharset;
        this.resourceService = resourceService;
        resourceReferenceExtractor = extractor;
    }

    public Charset getDefaultInputCharset() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResourceService getResourceService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResourceReferenceExtractor getResourceReferenceExtractor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
