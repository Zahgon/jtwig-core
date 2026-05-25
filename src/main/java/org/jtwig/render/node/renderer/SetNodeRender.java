package org.jtwig.render.node.renderer;

import org.jtwig.model.tree.SetNode;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.expression.CalculateExpressionService;
import org.jtwig.renderable.Renderable;
import org.jtwig.renderable.impl.EmptyRenderable;
import org.jtwig.value.context.ValueContext;

public class SetNodeRender implements NodeRender<SetNode> {

    @Override
    public Renderable render(RenderRequest request, SetNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
