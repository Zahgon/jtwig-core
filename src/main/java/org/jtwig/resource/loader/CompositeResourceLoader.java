package org.jtwig.resource.loader;

import com.google.common.base.Optional;
import org.jtwig.resource.exceptions.ResourceNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;

public class CompositeResourceLoader implements ResourceLoader {

    private final Collection<ResourceLoader> resourceLoaders;

    public CompositeResourceLoader(Collection<ResourceLoader> resourceLoaders) {
        this.resourceLoaders = resourceLoaders;
    }

    @Override
    public Optional<Charset> getCharset(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public InputStream load(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean exists(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Optional<URL> toUrl(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
