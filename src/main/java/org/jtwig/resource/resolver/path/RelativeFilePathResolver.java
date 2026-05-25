package org.jtwig.resource.resolver.path;

import java.io.File;

public class RelativeFilePathResolver implements RelativeReferenceResolver {

    private static final RelativeFilePathResolver INSTANCE = new RelativeFilePathResolver();

    public static RelativeFilePathResolver instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private RelativeFilePathResolver() {
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
