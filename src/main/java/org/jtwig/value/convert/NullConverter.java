package org.jtwig.value.convert;

public class NullConverter<T> implements Converter<T> {

    @Override
    public Result<T> convert(Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
