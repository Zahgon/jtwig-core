package org.jtwig.render.node.renderer;

import org.jtwig.environment.Environment;
import org.jtwig.macro.render.ImportRender;
import org.jtwig.model.tree.ImportNode;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.expression.CalculateExpressionService;
import org.jtwig.renderable.Renderable;
import org.jtwig.renderable.impl.EmptyRenderable;
import org.jtwig.resource.ResourceService;
import org.jtwig.resource.exceptions.ResourceNotFoundException;
import org.jtwig.resource.metadata.ResourceMetadata;
import org.jtwig.resource.reference.ResourceReference;
import org.jtwig.util.ErrorMessageFormatter;

public class ImportNodeRender implements NodeRender<ImportNode> {

    private final ImportRender importRender;

    public ImportNodeRender(ImportRender importRender) {
        this.importRender = importRender;
    }

    @Override
    public Renderable render(RenderRequest renderRequest, ImportNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
