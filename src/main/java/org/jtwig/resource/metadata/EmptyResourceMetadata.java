package org.jtwig.resource.metadata;

import com.google.common.base.Optional;
import org.jtwig.resource.exceptions.ResourceException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

public class EmptyResourceMetadata implements ResourceMetadata {

    private static final EmptyResourceMetadata INSTANCE = new EmptyResourceMetadata();

    public static EmptyResourceMetadata instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private EmptyResourceMetadata() {
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
}
