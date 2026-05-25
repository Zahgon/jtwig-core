package org.jtwig.resource.loader;

import com.google.common.base.Optional;
import org.jtwig.resource.exceptions.ResourceNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

public class ClasspathResourceLoader implements ResourceLoader {

    public static final String ROOT_PATH = "/";

    private final ClassLoader classLoader;

    public ClasspathResourceLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
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

    private String getPath(String path) {
        if (path.startsWith(ROOT_PATH)) {
            return path.substring(1);
        }
        return path;
    }
}
