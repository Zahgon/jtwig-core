package org.jtwig.parser.parboiled.expression;

import org.jtwig.model.expression.Expression;
import org.jtwig.model.expression.MapExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.BasicParser;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.parboiled.Rule;
import java.util.LinkedHashMap;
import java.util.Map;
import static org.parboiled.Parboiled.createParser;

public class MapExpressionParser extends ExpressionParser<MapExpression> {

    public MapExpressionParser(ParserContext context) {
        super(MapExpressionParser.class, context);
        createParser(MapParser.class, context);
        createParser(StringOrIdentifierParser.class, context);
    }

    @Override
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class MapParser extends BasicParser<Map<String, Expression>> {

        public MapParser(ParserContext context) {
            super(MapParser.class, context);
        }

        public Rule Expression() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public boolean run(Object value) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class StringOrIdentifierParser extends BasicParser<String> {

        public StringOrIdentifierParser(ParserContext context) {
            super(StringOrIdentifierParser.class, context);
        }

        public Rule Expression() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
