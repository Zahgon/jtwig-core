package org.jtwig.value.compare;

import org.jtwig.render.RenderRequest;
import org.jtwig.value.convert.Converter;
import java.math.BigDecimal;

public class DefaultValueComparator implements ValueComparator {

    @Override
    public int compare(final RenderRequest renderRequest, Object left, Object right) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String getString(RenderRequest renderRequest, Object value) {
        return renderRequest.getEnvironment().getValueEnvironment().getStringConverter().convert(value);
    }
}
