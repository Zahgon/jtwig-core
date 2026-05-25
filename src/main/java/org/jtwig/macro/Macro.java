package org.jtwig.macro;

import org.jtwig.model.tree.Node;
import org.jtwig.resource.reference.ResourceReference;
import java.util.List;

public class Macro {

    private final ResourceReference resourceReference;

    private final Node content;

    private final List<String> argumentNames;

    public Macro(ResourceReference resourceReference, Node content, List<String> argumentNames) {
        this.resourceReference = resourceReference;
        this.content = content;
        this.argumentNames = argumentNames;
    }

    public ResourceReference getResourceReference() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Node getContent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getArgumentNames() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
