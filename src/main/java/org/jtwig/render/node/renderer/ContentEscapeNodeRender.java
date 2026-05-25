package org.jtwig.render.node.renderer;

import com.google.common.base.Optional;
import org.jtwig.escape.EscapeEngine;
import org.jtwig.model.tree.ContentEscapeNode;
import org.jtwig.render.RenderRequest;
import org.jtwig.renderable.RenderException;
import org.jtwig.renderable.Renderable;
import org.jtwig.renderable.StringBuilderRenderResult;
import org.jtwig.renderable.impl.StringRenderable;
import org.jtwig.util.ErrorMessageFormatter;

public class ContentEscapeNodeRender implements NodeRender<ContentEscapeNode> {

    @Override
    public Renderable render(RenderRequest request, ContentEscapeNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
