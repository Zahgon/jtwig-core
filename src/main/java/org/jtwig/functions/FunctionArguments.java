package org.jtwig.functions;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import org.jtwig.model.expression.Expression;
import org.jtwig.reflection.model.Value;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionArguments {

    public static FunctionArguments empty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final Function<Expression, Object> expressionResolver;

    private final List<Expression> expressions;

    private final Value[] values;

    public FunctionArguments(Function<Expression, Object> expressionResolver, List<Expression> expressions) {
        this.expressionResolver = expressionResolver;
        this.expressions = expressions;
        this.values = new Value[expressions.size()];
    }

    public Expression getExpression(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object getValue(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object[] getRemainingArguments(int start) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int size() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Object> getValues() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Expression> getExpressions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
