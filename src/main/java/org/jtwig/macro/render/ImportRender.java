package org.jtwig.macro.render;

import org.jtwig.macro.ImportedMacros;
import org.jtwig.macro.Macro;
import org.jtwig.model.tree.MacroNode;
import org.jtwig.model.tree.Node;
import org.jtwig.model.tree.visitor.NodeVisitor;
import org.jtwig.render.RenderRequest;
import org.jtwig.resource.reference.ResourceReference;
import org.jtwig.value.context.ValueContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ImportRender {

    private static final ImportRender INSTANCE = new ImportRender();

    public static ImportRender instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private ImportRender() {
    }

    public void render(RenderRequest request, ResourceReference resourceReference, String macroIdentifier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class CollectMacroNodes implements NodeVisitor {

        private final Collection<MacroNode> macros;

        public CollectMacroNodes(Collection<MacroNode> macros) {
            this.macros = macros;
        }

        @Override
        public void consume(Node node) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
