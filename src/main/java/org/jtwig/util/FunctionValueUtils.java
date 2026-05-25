package org.jtwig.util;

import org.jtwig.exceptions.CalculationException;
import org.jtwig.functions.FunctionRequest;
import org.jtwig.value.WrappedCollection;
import org.jtwig.value.convert.Converter;
import java.math.BigDecimal;
import java.util.Collection;

public class FunctionValueUtils {

    private static final String NUMBER_TYPE = "number";

    private static final String COLLECTION_TYPE = "collection of objects";

    public static String getString(FunctionRequest request, int position) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static BigDecimal getNumber(FunctionRequest request, int position) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Collection<Object> getCollection(FunctionRequest request, int position) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static <T> T convert(Converter<T> converter, String typeName, FunctionRequest request, int position) {
        Object value = request.get(position);
        Converter.Result<T> result = converter.convert(value);
        if (result.isDefined()) {
            return result.get();
        } else {
            throw new CalculationException(ErrorMessageFormatter.errorMessage(request.getPosition(), String.format("Error converting argument with index %d ('%s' of type '%s') to %s", position, value, getType(value), typeName)));
        }
    }

    private static Object getType(Object value) {
        if (value == null)
            return null;
        return value.getClass();
    }
}
