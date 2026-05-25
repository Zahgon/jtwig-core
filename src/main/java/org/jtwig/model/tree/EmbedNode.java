package org.jtwig.model.tree;

import org.jtwig.model.expression.Expression;
import org.jtwig.model.position.Position;
import org.jtwig.model.tree.include.IncludeConfiguration;
import org.jtwig.model.tree.visitor.NodeVisitor;
import java.util.Collection;

public class EmbedNode extends Node {

    private final Collection<OverrideBlockNode> nodes;

    private final IncludeConfiguration includeConfiguration;

    public EmbedNode(Position position, Collection<OverrideBlockNode> nodes, IncludeConfiguration includeConfiguration) {
        super(position);
        this.nodes = nodes;
        this.includeConfiguration = includeConfiguration;
    }

    public Collection<OverrideBlockNode> getNodes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Expression getResourceExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Expression getMapExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isInheritModel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isIgnoreMissing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(NodeVisitor nodeConsumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
