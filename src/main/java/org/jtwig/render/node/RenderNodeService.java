package org.jtwig.render.node;

import com.google.common.base.Optional;
import org.jtwig.escape.EscapeEngine;
import org.jtwig.model.tree.Node;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.listeners.RenderStage;
import org.jtwig.render.node.renderer.NodeRender;
import org.jtwig.renderable.Renderable;
import org.jtwig.util.ErrorMessageFormatter;

public class RenderNodeService {

    private final NodeRenderSelector nodeRenderSelector;

    public RenderNodeService(NodeRenderSelector nodeRenderSelector) {
        this.nodeRenderSelector = nodeRenderSelector;
    }

    public Renderable render(RenderRequest request, Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
