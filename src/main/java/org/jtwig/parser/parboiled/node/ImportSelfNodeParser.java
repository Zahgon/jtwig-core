package org.jtwig.parser.parboiled.node;

import org.jtwig.model.tree.ImportSelfNode;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.parser.parboiled.base.LimitsParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.expression.VariableExpressionParser;
import org.jtwig.parser.parboiled.model.Keyword;
import org.parboiled.Rule;
import org.parboiled.annotations.Label;

public class ImportSelfNodeParser extends NodeParser<ImportSelfNode> {

    private static final String SELF = "_self";

    public ImportSelfNodeParser(ParserContext context) {
        super(ImportSelfNodeParser.class, context);
    }

    @Override
    @Label("Import Self Node")
    public Rule NodeRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
