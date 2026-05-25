package org.jtwig.parser.parboiled.node;

import org.jtwig.model.expression.Expression;
import org.jtwig.model.expression.MapExpression;
import org.jtwig.model.tree.EmbedNode;
import org.jtwig.model.tree.OverrideBlockNode;
import org.jtwig.model.tree.include.IncludeConfiguration;
import org.jtwig.parser.ParseException;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.*;
import org.jtwig.parser.parboiled.expression.AnyExpressionParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.jtwig.util.ErrorMessageFormatter;
import org.parboiled.Rule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import static org.parboiled.Parboiled.createParser;

public class EmbedNodeParser extends NodeParser<EmbedNode> {

    public EmbedNodeParser(ParserContext context) {
        super(EmbedNodeParser.class, context);
        createParser(DefinitionsParser.class, context, endEmbed());
    }

    @Override
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule endEmbed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class DefinitionsParser extends BasicParser<Collection<OverrideBlockNode>> {

        final Rule endEmbed;

        public DefinitionsParser(ParserContext context, Rule endEmbed) {
            super(DefinitionsParser.class, context);
            this.endEmbed = endEmbed;
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
