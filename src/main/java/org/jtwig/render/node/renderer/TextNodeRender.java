package org.jtwig.render.node.renderer;

import org.jtwig.model.tree.TextNode;
import org.jtwig.render.RenderRequest;
import org.jtwig.renderable.Renderable;
import org.jtwig.renderable.impl.StringRenderable;

public class TextNodeRender implements NodeRender<TextNode> {

    @Override
    public Renderable render(RenderRequest request, TextNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String trimRight(String content) {
        return content.replaceAll("\\s+$", "");
    }

    private String trimLeft(String content) {
        return content.replaceAll("^\\s+", "");
    }
}
