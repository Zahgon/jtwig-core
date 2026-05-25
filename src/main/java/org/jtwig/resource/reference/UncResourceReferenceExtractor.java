package org.jtwig.resource.reference;

public class UncResourceReferenceExtractor implements ResourceReferenceExtractor {

    @Override
    public ResourceReference extract(String spec) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean isAbsolute(String spec) {
        return spec.length() > 2 && spec.charAt(1) == ':' && spec.charAt(2) == '\\';
    }
}
