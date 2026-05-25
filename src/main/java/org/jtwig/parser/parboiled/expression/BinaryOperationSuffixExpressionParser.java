package org.jtwig.parser.parboiled.expression;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Multimaps;
import org.jtwig.model.expression.BinaryOperationExpression;
import org.jtwig.parser.parboiled.ParserContext;
import org.jtwig.parser.parboiled.base.PositionTrackerParser;
import org.jtwig.parser.parboiled.base.SpacingParser;
import org.jtwig.parser.parboiled.expression.operator.BinaryOperatorParser;
import org.jtwig.render.expression.calculator.operation.binary.BinaryOperator;
import org.parboiled.Rule;
import org.parboiled.annotations.Label;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinaryOperationSuffixExpressionParser extends ExpressionParser<BinaryOperationExpression> {

    final Collection<BinaryOperator> operators;

    public BinaryOperationSuffixExpressionParser(ParserContext context, Collection<BinaryOperator> operators) {
        super(BinaryOperationSuffixExpressionParser.class, context);
        this.operators = operators;
    }

    @Override
    @Label("BinaryOperationSuffix Expression")
    public Rule ExpressionRule() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Function<BinaryOperator, Integer> precedence() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Rule BinaryOperation(Rule expressionRule, List<BinaryOperator> operators) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
