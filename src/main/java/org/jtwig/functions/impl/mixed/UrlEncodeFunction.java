package org.jtwig.functions.impl.mixed;

import org.apache.commons.lang3.StringUtils;
import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import org.jtwig.util.UrlEncodingUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UrlEncodeFunction extends SimpleJtwigFunction {

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String getString(FunctionRequest request, int index) {
        return request.getEnvironment().getValueEnvironment().getStringConverter().convert(request.get(index));
    }

    private String encodeString(FunctionRequest request, String input) {
        return UrlEncodingUtils.encode(input, Charset.defaultCharset().displayName(), request.getPosition());
    }
}
