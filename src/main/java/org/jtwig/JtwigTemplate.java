package org.jtwig;

import org.jtwig.environment.*;
import org.jtwig.escape.EscapeEngine;
import org.jtwig.model.tree.Node;
import org.jtwig.render.RenderRequest;
import org.jtwig.render.context.RenderContext;
import org.jtwig.render.context.RenderContextHolder;
import org.jtwig.render.context.model.BlockContext;
import org.jtwig.render.listeners.RenderStage;
import org.jtwig.renderable.RenderResult;
import org.jtwig.renderable.StreamRenderResult;
import org.jtwig.renderable.StringBuilderRenderResult;
import org.jtwig.resource.reference.ResourceReference;
import org.jtwig.value.context.IsolateParentValueContext;
import org.jtwig.value.context.JtwigModelValueContext;
import org.jtwig.value.context.MapValueContext;
import org.jtwig.value.context.ValueContext;
import java.io.File;
import java.io.OutputStream;
import static org.jtwig.resource.reference.ResourceReference.*;

public class JtwigTemplate {

    public static final EnvironmentFactory ENVIRONMENT_FACTORY = new EnvironmentFactory();

    public static JtwigTemplate inlineTemplate(String template) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static JtwigTemplate inlineTemplate(String template, EnvironmentConfiguration configuration) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static JtwigTemplate classpathTemplate(String location) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static JtwigTemplate classpathTemplate(String location, EnvironmentConfiguration environmentConfiguration) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static JtwigTemplate fileTemplate(String filename, EnvironmentConfiguration environmentConfiguration) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static JtwigTemplate fileTemplate(String filename) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static JtwigTemplate fileTemplate(File path, EnvironmentConfiguration environmentConfiguration) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static JtwigTemplate fileTemplate(File path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final ResourceReference resource;

    private final Environment environment;

    public JtwigTemplate(Environment environment, ResourceReference resource) {
        this.resource = resource;
        this.environment = environment;
    }

    public String render(JtwigModel model) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void render(JtwigModel model, OutputStream outputStream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void render(JtwigModel model, RenderResult renderResult) {
        RenderContext renderContext = RenderContext.create().start(ValueContext.class, new IsolateParentValueContext(new JtwigModelValueContext(model), MapValueContext.newContext())).start(EscapeEngine.class, environment.getEscapeEnvironment().getInitialEscapeEngine()).start(ResourceReference.class, resource).start(BlockContext.class, BlockContext.newContext());
        EnvironmentHolder.set(environment);
        RenderContextHolder.set(renderContext);
        RenderRequest renderRequest = new RenderRequest(renderContext, environment);
        environment.getRenderEnvironment().getRenderListeners().trigger(RenderStage.PRE_TEMPLATE_RENDER, renderRequest);
        environment.getRenderEnvironment().getRenderListeners().trigger(RenderStage.PRE_RESOURCE_RENDER, renderRequest);
        Node node = environment.getParser().parse(environment, resource);
        environment.getRenderEnvironment().getRenderNodeService().render(renderRequest, node).appendTo(renderResult);
        environment.getRenderEnvironment().getRenderListeners().trigger(RenderStage.POST_RESOURCE_RENDER, renderRequest);
        environment.getRenderEnvironment().getRenderListeners().trigger(RenderStage.POST_TEMPLATE_RENDER, renderRequest);
        renderContext.end(ValueContext.class);
        renderContext.end(EscapeEngine.class);
        renderContext.end(ResourceReference.class);
        renderContext.end(BlockContext.class);
        EnvironmentHolder.remove();
        RenderContextHolder.remove();
    }
}
