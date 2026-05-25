package org.jtwig.render;

import org.jtwig.resource.reference.ResourceReference;
import org.jtwig.value.WrappedCollection;

public class RenderResourceRequest {

    private final ResourceReference resource;

    private final boolean newBlockContext;

    private final boolean newValueContext;

    private final WrappedCollection includeModel;

    public RenderResourceRequest(ResourceReference resource, boolean newBlockContext, boolean newValueContext, WrappedCollection includeModel) {
        this.resource = resource;
        this.newBlockContext = newBlockContext;
        this.newValueContext = newValueContext;
        this.includeModel = includeModel;
    }

    public ResourceReference getResource() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isNewBlockContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isNewValueContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public WrappedCollection getIncludeModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
