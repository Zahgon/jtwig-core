package org.jtwig.model.tree;

import org.jtwig.model.expression.VariableExpression;
import org.jtwig.model.position.Position;
import java.util.ArrayList;
import java.util.List;

public class MacroNode extends ContentNode {

    public static MacroNode create(Position position, VariableExpression macroName, List<VariableExpression> macroArgumentExpressions, Node content) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final VariableExpression macroName;

    private final List<String> macroArgumentNames;

    public MacroNode(Position position, VariableExpression macroName, List<String> macroArgumentNames, Node content) {
        super(position, content);
        this.macroName = macroName;
        this.macroArgumentNames = macroArgumentNames;
    }

    public VariableExpression getMacroName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<String> getMacroArgumentNames() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
