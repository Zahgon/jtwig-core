package org.jtwig.render.node.renderer;

import org.jtwig.model.tree.IfNode;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.expression.CalculateExpressionService;
import org.jtwig.render.node.RenderNodeService;
import org.jtwig.renderable.Renderable;
import org.jtwig.renderable.impl.EmptyRenderable;
import org.jtwig.value.convert.Converter;
import java.util.Collection;

public class IfNodeRender implements NodeRender<IfNode> {

    @Override
    public Renderable render(RenderRequest request, IfNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
