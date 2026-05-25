package org.jtwig.value.environment;

import org.jtwig.value.WrappedCollection;
import org.jtwig.value.compare.ValueComparator;
import org.jtwig.value.convert.Converter;
import org.jtwig.value.convert.string.StringConverter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ValueEnvironment {

    private final MathContext mathContext;

    private final RoundingMode roundingMode;

    private final Converter<BigDecimal> numberConverter;

    private final Converter<Boolean> booleanConverter;

    private final Converter<WrappedCollection> collectionConverter;

    private final Converter<Character> charConverter;

    private final ValueComparator valueComparator;

    private final StringConverter stringConverter;

    public ValueEnvironment(MathContext mathContext, RoundingMode roundingMode, Converter<BigDecimal> numberConverter, Converter<Boolean> booleanConverter, Converter<WrappedCollection> collectionConverter, Converter<Character> charConverter, ValueComparator valueComparator, StringConverter stringConverter) {
        this.mathContext = mathContext;
        this.roundingMode = roundingMode;
        this.numberConverter = numberConverter;
        this.booleanConverter = booleanConverter;
        this.collectionConverter = collectionConverter;
        this.charConverter = charConverter;
        this.valueComparator = valueComparator;
        this.stringConverter = stringConverter;
    }

    public MathContext getMathContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public RoundingMode getRoundingMode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Converter<BigDecimal> getNumberConverter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Converter<Boolean> getBooleanConverter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Converter<WrappedCollection> getCollectionConverter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Converter<Character> getCharConverter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ValueComparator getValueComparator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public StringConverter getStringConverter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
