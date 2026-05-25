package org.jtwig.functions.impl.control;

import org.jtwig.escape.EscapeEngine;
import org.jtwig.escape.NoneEscapeEngine;
import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import org.jtwig.render.context.RenderContext;
import org.jtwig.render.context.RenderContextHolder;

public class RawFunction extends SimpleJtwigFunction {

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected RenderContext getRenderContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
