package org.jtwig.render.node.renderer;

import org.jtwig.model.tree.ForLoopNode;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.expression.CalculateExpressionService;
import org.jtwig.render.node.RenderNodeService;
import org.jtwig.renderable.Renderable;
import org.jtwig.renderable.impl.CompositeRenderable;
import org.jtwig.util.LoopCursor;
import org.jtwig.value.WrappedCollection;
import org.jtwig.value.context.StaticVariableValueContext;
import org.jtwig.value.context.ValueContext;
import org.jtwig.value.convert.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class ForLoopNodeRender implements NodeRender<ForLoopNode> {

    public static final String LOOP = "loop";

    @Override
    public Renderable render(RenderRequest request, ForLoopNode node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
