package org.jtwig.property.selection.cache;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.jtwig.model.expression.Expression;

public class SelectionPropertyResolverCacheKey {

    private final int leftValueClassHashcode;

    private final Expression expression;

    private SelectionPropertyResolverCacheKey(int leftValueClassHashcode, Expression expression) {
        this.leftValueClassHashcode = leftValueClassHashcode;
        this.expression = expression;
    }

    public static SelectionPropertyResolverCacheKey createFor(int leftValueClassHashcode, Expression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static SelectionPropertyResolverCacheKey createFor(Class<?> leftValueClass, Expression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static SelectionPropertyResolverCacheKey createFor(Object leftValue, Expression expression) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
