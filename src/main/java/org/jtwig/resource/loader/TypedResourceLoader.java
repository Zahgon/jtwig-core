package org.jtwig.resource.loader;

public class TypedResourceLoader {

    private final String type;

    private final ResourceLoader resourceLoader;

    public TypedResourceLoader(String type, ResourceLoader resourceLoader) {
        this.type = type;
        this.resourceLoader = resourceLoader;
    }

    public String getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResourceLoader getResourceLoader() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
