package org.jtwig.value.convert.bool;

import org.jtwig.value.Undefined;
import org.jtwig.value.convert.Converter;
import java.util.Map;

public class BooleanConverter implements Converter<Boolean> {

    public static final String TRUE = "true";

    public static final String FALSE = "false";

    @Override
    public Result<Boolean> convert(Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
