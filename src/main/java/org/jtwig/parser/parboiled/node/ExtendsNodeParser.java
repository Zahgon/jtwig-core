package org.jtwig.parser.parboiled.node;

import org.jtwig.model.tree.ExtendsNode;
import org.jtwig.model.tree.Node;
import org.jtwig.parser.ParseException;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.*;
import org.jtwig.parser.parboiled.expression.AnyExpressionParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.jtwig.util.ErrorMessageFormatter;
import org.parboiled.Rule;
import java.util.ArrayList;
import java.util.Collection;
import static org.parboiled.Parboiled.createParser;

public class ExtendsNodeParser extends NodeParser<ExtendsNode> {

    public ExtendsNodeParser(ParserContext context) {
        super(ExtendsNodeParser.class, context);
        createParser(ExtendDefinitionsParser.class, context);
    }

    @Override
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class ExtendDefinitionsParser extends BasicParser<Collection<Node>> {

        public ExtendDefinitionsParser(ParserContext context) {
            super(ExtendDefinitionsParser.class, context);
        }

        Rule Definitions() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Rule invalidConstruct() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public boolean throwException(String message) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
