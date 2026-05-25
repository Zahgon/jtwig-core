package org.jtwig.model.expression.test;

public class NotTestExpression extends TestExpression {

    public static TestExpression create(Boolean isNot, TestExpression nested) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final TestExpression testExpression;

    public NotTestExpression(TestExpression testExpression) {
        this.testExpression = testExpression;
    }

    public TestExpression getTestExpression() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
