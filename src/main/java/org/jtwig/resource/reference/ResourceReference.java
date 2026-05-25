package org.jtwig.resource.reference;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.io.File;

public class ResourceReference {

    public static final String ANY_TYPE = "any";

    public static final String STRING = "string";

    public static final String FILE = "file";

    public static final String MEMORY = "memory";

    public static final String CLASSPATH = "classpath";

    public static ResourceReference inline(String template) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static ResourceReference memory(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static ResourceReference file(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static ResourceReference file(File path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static ResourceReference classpath(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final String type;

    private final String path;

    public ResourceReference(String type, String path) {
        this.type = type;
        this.path = path;
    }

    public String getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
