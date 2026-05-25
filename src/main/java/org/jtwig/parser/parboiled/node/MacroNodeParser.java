package org.jtwig.parser.parboiled.node;

import org.jtwig.model.expression.VariableExpression;
import org.jtwig.model.tree.MacroNode;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.*;
import org.jtwig.parser.parboiled.expression.VariableExpressionParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;
import java.util.ArrayList;
import java.util.List;
import static org.parboiled.Parboiled.createParser;

public class MacroNodeParser extends NodeParser<MacroNode> {

    public MacroNodeParser(ParserContext context) {
        super(MacroNodeParser.class, context);
        createParser(ParametersParser.class, context);
    }

    @Override
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class ParametersParser extends BasicParser<List<VariableExpression>> {

        public ParametersParser(ParserContext context) {
            super(ParametersParser.class, context);
        }

        Rule Parameters() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
