package org.jtwig.parser.parboiled.expression.operator;

import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.BasicParser;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.render.expression.calculator.operation.binary.BinaryOperator;
import org.parboiled.Rule;
import java.util.List;

public class BinaryOperatorParser extends BasicParser<BinaryOperator> {

    public BinaryOperatorParser(ParserContext context) {
        super(BinaryOperatorParser.class, context);
    }

    Rule operator(BinaryOperator operator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Rule BinaryOperator(List<BinaryOperator> operators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean endsWithNonSymbol(String symbol) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
