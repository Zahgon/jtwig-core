package org.jtwig.functions;

import org.jtwig.exceptions.CalculationException;
import org.jtwig.model.expression.Expression;
import org.jtwig.model.position.Position;
import org.jtwig.render.RenderRequest;
import java.util.List;
import static org.jtwig.util.ErrorMessageFormatter.errorMessage;

public class FunctionRequest extends RenderRequest {

    private final Position position;

    private final String functionName;

    private final FunctionArguments functionArguments;

    public FunctionRequest(RenderRequest request, Position position, String functionName, FunctionArguments functionArguments) {
        super(request.getRenderContext(), request.getEnvironment());
        this.position = position;
        this.functionName = functionName;
        this.functionArguments = functionArguments;
    }

    public Position getPosition() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getNumberOfArguments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Object> getArguments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Expression> getExpressionArguments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FunctionRequest minimumNumberOfArguments(int number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FunctionRequest maximumNumberOfArguments(int number) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public CalculationException exception(String message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public CalculationException exception(String message, Throwable e) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object get(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Expression getExpression(int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object[] getRemainingArguments(int start) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
