package org.jtwig.render.node.renderer;

import org.jtwig.environment.Environment;
import org.jtwig.model.expression.Expression;
import org.jtwig.model.tree.ExtendsNode;
import org.jtwig.model.tree.Node;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.RenderResourceRequest;
import org.jtwig.render.RenderResourceService;
import org.jtwig.render.expression.CalculateExpressionService;
import org.jtwig.render.node.RenderNodeService;
import org.jtwig.renderable.Renderable;
import org.jtwig.resource.ResourceService;
import org.jtwig.resource.exceptions.ResourceNotFoundException;
import org.jtwig.resource.metadata.ResourceMetadata;
import org.jtwig.resource.reference.ResourceReference;
import org.jtwig.value.WrappedCollection;
import static org.jtwig.util.ErrorMessageFormatter.errorMessage;

public class ExtendsNodeRender implements NodeRender<ExtendsNode> {

    @Override
    public Renderable render(RenderRequest renderRequest, ExtendsNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
