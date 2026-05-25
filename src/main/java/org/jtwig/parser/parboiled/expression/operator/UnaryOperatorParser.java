package org.jtwig.parser.parboiled.expression.operator;

import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.BasicParser;
import org.jtwig.parser.parboiled.base.LexicParser;
import org.jtwig.render.expression.calculator.operation.unary.UnaryOperator;
import org.parboiled.Rule;
import java.util.*;

public class UnaryOperatorParser extends BasicParser<UnaryOperator> {

    final List<UnaryOperator> operators;

    public UnaryOperatorParser(ParserContext context, Collection<UnaryOperator> operators) {
        super(UnaryOperatorParser.class, context);
        this.operators = new ArrayList<>(operators);
    }

    public Rule UnaryOperator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Rule UnaryOperator(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean endsWithNonSymbol(String symbol) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
