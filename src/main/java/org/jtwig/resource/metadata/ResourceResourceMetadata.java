package org.jtwig.resource.metadata;

import com.google.common.base.Optional;
import org.jtwig.resource.loader.ResourceLoader;
import org.jtwig.resource.reference.ResourceReference;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

public class ResourceResourceMetadata implements ResourceMetadata {

    private final ResourceLoader resourceLoader;

    private final ResourceReference resourceReference;

    public ResourceResourceMetadata(ResourceLoader resourceLoader, ResourceReference resourceReference) {
        this.resourceLoader = resourceLoader;
        this.resourceReference = resourceReference;
    }

    @Override
    public boolean exists() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public InputStream load() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Optional<Charset> getCharset() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Optional<URL> toUrl() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResourceReference getResourceReference() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
