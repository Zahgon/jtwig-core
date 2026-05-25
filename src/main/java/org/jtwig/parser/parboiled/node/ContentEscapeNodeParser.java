package org.jtwig.parser.parboiled.node;

import com.google.common.base.Optional;
import org.jtwig.model.tree.ContentEscapeNode;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.*;
import org.jtwig.parser.parboiled.expression.StringExpressionParser;
import org.parboiled.Rule;
import org.parboiled.annotations.Label;
import static org.parboiled.Parboiled.createParser;

public class ContentEscapeNodeParser extends NodeParser<ContentEscapeNode> {

    public ContentEscapeNodeParser(ParserContext context) {
        super(ContentEscapeNodeParser.class, context);
        createParser(EscapeModeParser.class, context);
    }

    @Override
    @Label("Auto Escape")
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class EscapeModeParser extends BasicParser<String> {

        public EscapeModeParser(ParserContext context) {
            super(EscapeModeParser.class, context);
        }

        public Rule EscapeMode() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
