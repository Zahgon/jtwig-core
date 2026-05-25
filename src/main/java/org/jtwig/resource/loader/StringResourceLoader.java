package org.jtwig.resource.loader;

import com.google.common.base.Optional;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

public class StringResourceLoader implements ResourceLoader {

    private static final StringResourceLoader INSTANCE = new StringResourceLoader();

    public static StringResourceLoader instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private StringResourceLoader() {
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
