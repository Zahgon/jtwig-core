package org.jtwig.model.tree;

import org.jtwig.model.position.Position;
import org.jtwig.model.tree.visitor.NodeVisitor;
import java.util.Collection;

public class CompositeNode extends Node {

    private final Collection<Node> nodes;

    public CompositeNode(Position position, Collection<Node> nodes) {
        super(position);
        this.nodes = nodes;
    }

    public Collection<Node> getNodes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(NodeVisitor nodeConsumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
