package org.jtwig.functions.impl.string;

import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import static org.jtwig.util.FunctionValueUtils.getNumber;
import static org.jtwig.util.FunctionValueUtils.getString;

public class NumberFormatFunction extends SimpleJtwigFunction {

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String numberFormat(Object numberArg, BigDecimal fractionDigits, String decimalSeparator, String groupingSeparator) {
        Object number = (numberArg == null) ? 0 : numberArg;
        DecimalFormat numberFormat = new DecimalFormat();
        DecimalFormatSymbols decimalFormatSymbols = numberFormat.getDecimalFormatSymbols();
        if (fractionDigits != null) {
            numberFormat.setMaximumFractionDigits(fractionDigits.intValue());
            numberFormat.setMinimumFractionDigits(fractionDigits.intValue());
        }
        if (decimalSeparator != null && !decimalSeparator.isEmpty())
            decimalFormatSymbols.setDecimalSeparator(decimalSeparator.charAt(0));
        else
            decimalFormatSymbols.setDecimalSeparator('.');
        if (groupingSeparator != null && !groupingSeparator.isEmpty())
            decimalFormatSymbols.setGroupingSeparator(groupingSeparator.charAt(0));
        else
            numberFormat.setGroupingUsed(false);
        numberFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return numberFormat.format(number);
    }
}
