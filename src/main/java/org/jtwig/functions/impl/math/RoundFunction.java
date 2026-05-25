package org.jtwig.functions.impl.math;

import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import org.jtwig.util.FunctionValueUtils;
import java.math.BigDecimal;

public class RoundFunction extends SimpleJtwigFunction {

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public enum RoundStrategy {

        COMMON(new StaticRound(BigDecimal.ROUND_HALF_UP)), CEIL(new StaticRound(BigDecimal.ROUND_CEILING)), FLOOR(new StaticRound(BigDecimal.ROUND_FLOOR));

        private Round round;

        RoundStrategy(Round round) {
            this.round = round;
        }

        public BigDecimal round(BigDecimal number, int precision) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private interface Round {

        BigDecimal round(BigDecimal number, int precision);
    }

    private static class StaticRound implements Round {

        private final int roundingMode;

        StaticRound(int roundingMode) {
            this.roundingMode = roundingMode;
        }

        @Override
        public BigDecimal round(BigDecimal number, int precision) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
