package org.jtwig.model.tree;

import org.jtwig.model.expression.Expression;
import org.jtwig.model.position.Position;
import org.jtwig.model.tree.visitor.NodeVisitor;
import java.util.Collection;

public class IfNode extends Node {

    private final Collection<IfConditionNode> conditionNodes;

    public IfNode(Position position, Collection<IfConditionNode> conditionNodes) {
        super(position);
        this.conditionNodes = conditionNodes;
    }

    public Collection<IfConditionNode> getConditionNodes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void visit(NodeVisitor nodeConsumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class IfConditionNode extends ContentNode {

        private final Expression condition;

        public IfConditionNode(Position position, Expression condition, Node content) {
            super(position, content);
            this.condition = condition;
        }

        public Expression getCondition() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
