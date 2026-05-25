package org.jtwig.render.node.renderer;

import com.google.common.base.Optional;
import org.jtwig.escape.EscapeEngine;
import org.jtwig.model.tree.AutoEscapeNode;
import org.jtwig.render.RenderRequest;
import org.jtwig.renderable.RenderException;
import org.jtwig.renderable.Renderable;
import org.jtwig.util.ErrorMessageFormatter;

public class AutoEscapeNodeRender implements NodeRender<AutoEscapeNode> {

    @Override
    public Renderable render(RenderRequest request, AutoEscapeNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
