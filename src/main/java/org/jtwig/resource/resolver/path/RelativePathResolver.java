package org.jtwig.resource.resolver.path;

import org.jtwig.resource.exceptions.ResourceException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.InvalidPathException;

public class RelativePathResolver implements RelativeReferenceResolver {

    public static final String ROOT_PATH = "/";

    private static final RelativePathResolver INSTANCE = new RelativePathResolver();

    public static RelativePathResolver instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private RelativePathResolver() {
    }

    @Override
    public boolean isRelative(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String resolve(String parent, String child) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
