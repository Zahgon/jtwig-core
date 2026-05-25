package org.jtwig.render.node.renderer;

import org.jtwig.model.tree.BlockNode;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.context.model.BlockContext;
import org.jtwig.render.context.model.BlockDefinition;
import org.jtwig.render.context.model.BlockReference;
import org.jtwig.render.node.RenderNodeService;
import org.jtwig.renderable.Renderable;
import org.jtwig.resource.reference.ResourceReference;

public class BlockNodeRender implements NodeRender<BlockNode> {

    @Override
    public Renderable render(RenderRequest renderRequest, BlockNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
