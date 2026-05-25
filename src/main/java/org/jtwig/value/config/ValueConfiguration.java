package org.jtwig.value.config;

import org.jtwig.value.WrappedCollection;
import org.jtwig.value.compare.ValueComparator;
import org.jtwig.value.convert.Converter;
import org.jtwig.value.convert.string.StringConverter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Collection;

public class ValueConfiguration {

    private final MathContext mathContext;

    private final RoundingMode roundingMode;

    private final Collection<Converter<Boolean>> booleanConverters;

    private final Collection<Converter<BigDecimal>> numberConverters;

    private final Collection<Converter<WrappedCollection>> collectionConverters;

    private final Collection<Converter<Character>> charConverters;

    private final ValueComparator valueComparator;

    private final StringConverter stringConverter;

    public ValueConfiguration(MathContext mathContext, RoundingMode roundingMode, Collection<Converter<Boolean>> booleanConverters, Collection<Converter<BigDecimal>> numberConverters, Collection<Converter<WrappedCollection>> collectionConverters, Collection<Converter<Character>> charConverters, ValueComparator valueComparator, StringConverter stringConverter) {
        this.mathContext = mathContext;
        this.roundingMode = roundingMode;
        this.booleanConverters = booleanConverters;
        this.numberConverters = numberConverters;
        this.collectionConverters = collectionConverters;
        this.charConverters = charConverters;
        this.valueComparator = valueComparator;
        this.stringConverter = stringConverter;
    }

    public MathContext getMathContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RoundingMode getRoundingMode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<Converter<Boolean>> getBooleanConverters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<Converter<BigDecimal>> getNumberConverters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<Converter<WrappedCollection>> getCollectionConverters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<Converter<Character>> getCharConverters() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ValueComparator getValueComparator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public StringConverter getStringConverter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
