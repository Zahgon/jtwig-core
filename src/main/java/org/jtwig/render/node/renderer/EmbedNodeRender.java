package org.jtwig.render.node.renderer;

import org.jtwig.environment.Environment;
import org.jtwig.model.tree.EmbedNode;
import org.jtwig.model.tree.Node;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.RenderResourceRequest;
import org.jtwig.render.RenderResourceService;
import org.jtwig.render.context.model.BlockContext;
import org.jtwig.render.expression.CalculateExpressionService;
import org.jtwig.render.node.RenderNodeService;
import org.jtwig.renderable.Renderable;
import org.jtwig.renderable.impl.EmptyRenderable;
import org.jtwig.resource.ResourceService;
import org.jtwig.resource.exceptions.ResourceNotFoundException;
import org.jtwig.resource.metadata.ResourceMetadata;
import org.jtwig.resource.reference.ResourceReference;
import org.jtwig.util.ErrorMessageFormatter;
import org.jtwig.value.WrappedCollection;
import org.jtwig.value.convert.Converter;

public class EmbedNodeRender implements NodeRender<EmbedNode> {

    @Override
    public Renderable render(RenderRequest renderRequest, EmbedNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
