package org.jtwig.render;

import org.jtwig.environment.Environment;
import org.jtwig.escape.EscapeEngine;
import org.jtwig.model.tree.Node;
import org.jtwig.render.context.model.BlockContext;
import org.jtwig.render.listeners.RenderStage;
import org.jtwig.render.node.RenderNodeService;
import org.jtwig.renderable.Renderable;
import org.jtwig.resource.reference.ResourceReference;
import org.jtwig.value.context.IsolateParentValueContext;
import org.jtwig.value.context.MapValueContext;
import org.jtwig.value.context.ValueContext;
import java.util.Iterator;
import java.util.Map;

public class RenderResourceService {

    public Renderable render(RenderRequest request, RenderResourceRequest renderResourceRequest) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
