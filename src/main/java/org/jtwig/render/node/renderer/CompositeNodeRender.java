package org.jtwig.render.node.renderer;

import org.jtwig.model.tree.CompositeNode;
import org.jtwig.model.tree.Node;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.node.RenderNodeService;
import org.jtwig.renderable.Renderable;
import org.jtwig.renderable.impl.CompositeRenderable;
import java.util.ArrayList;
import java.util.Collection;

public class CompositeNodeRender implements NodeRender<CompositeNode> {

    @Override
    public Renderable render(RenderRequest request, CompositeNode list) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
