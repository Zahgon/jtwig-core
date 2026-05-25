package org.jtwig.value.convert;

import java.util.Collection;

public class CompositeConverter<T> implements Converter<T> {

    private final Collection<Converter<T>> converters;

    public CompositeConverter(Collection<Converter<T>> converters) {
        this.converters = converters;
    }

    @Override
    public Result<T> convert(Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
