package org.jtwig.render.expression.calculator.operation.binary.calculators.selection;

import org.jtwig.exceptions.CalculationException;
import org.jtwig.property.selection.SelectionPropertyResolver;
import org.jtwig.property.selection.SelectionRequest;
import org.jtwig.property.selection.SelectionResult;
import org.jtwig.render.expression.calculator.operation.binary.calculators.BinaryOperationCalculator;
import org.jtwig.value.Undefined;
import static org.jtwig.util.ErrorMessageFormatter.errorMessage;

public class SelectionOperationCalculator implements BinaryOperationCalculator {

    private final SelectionErrorMessageGenerator selectionErrorMessageGenerator;

    public SelectionOperationCalculator(SelectionErrorMessageGenerator selectionErrorMessageGenerator) {
        this.selectionErrorMessageGenerator = selectionErrorMessageGenerator;
    }

    @Override
    public Object calculate(Request request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
