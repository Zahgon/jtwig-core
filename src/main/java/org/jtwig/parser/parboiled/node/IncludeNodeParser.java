package org.jtwig.parser.parboiled.node;

import org.jtwig.model.expression.Expression;
import org.jtwig.model.expression.MapExpression;
import org.jtwig.model.tree.IncludeNode;
import org.jtwig.model.tree.include.IncludeConfiguration;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.*;
import org.jtwig.parser.parboiled.expression.AnyExpressionParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;
import java.util.HashMap;

public class IncludeNodeParser extends NodeParser<IncludeNode> {

    public IncludeNodeParser(ParserContext context) {
        super(IncludeNodeParser.class, context);
    }

    @Override
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
