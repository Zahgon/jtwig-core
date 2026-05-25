package org.jtwig.parser.parboiled.base;

import org.jtwig.model.position.Position;
import org.jtwig.parser.parboiled.ParserContext;

public class PositionTrackerParser extends BasicParser<Position> {

    public PositionTrackerParser(ParserContext context) {
        super(PositionTrackerParser.class, context);
    }

    public boolean PushPosition() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Position currentPosition() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
