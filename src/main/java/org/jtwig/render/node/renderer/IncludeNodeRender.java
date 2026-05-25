package org.jtwig.render.node.renderer;

import org.jtwig.environment.Environment;
import org.jtwig.model.tree.IncludeNode;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.RenderResourceRequest;
import org.jtwig.render.RenderResourceService;
import org.jtwig.render.expression.CalculateExpressionService;
import org.jtwig.renderable.Renderable;
import org.jtwig.renderable.impl.EmptyRenderable;
import org.jtwig.resource.ResourceService;
import org.jtwig.resource.exceptions.ResourceNotFoundException;
import org.jtwig.resource.metadata.ResourceMetadata;
import org.jtwig.resource.reference.ResourceReference;
import org.jtwig.util.ErrorMessageFormatter;
import org.jtwig.value.WrappedCollection;
import org.jtwig.value.convert.Converter;

public class IncludeNodeRender implements NodeRender<IncludeNode> {

    @Override
    public Renderable render(RenderRequest renderRequest, IncludeNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
