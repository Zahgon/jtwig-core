package org.jtwig.value.convert;

import org.jtwig.exceptions.CalculationException;
import org.jtwig.model.position.Position;
import org.jtwig.util.ErrorMessageFormatter;

public interface Converter<T> {

    Result<T> convert(Object object);

    class Result<T> {

        public static <T> Result<T> undefined() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public static <T> Result<T> defined(T value) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        private final T value;

        private final boolean defined;

        public Result(T value, boolean defined) {
            this.value = value;
            this.defined = defined;
        }

        public T get() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public boolean isDefined() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T or(T otherwise) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T orThrow(Position position, String message) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
