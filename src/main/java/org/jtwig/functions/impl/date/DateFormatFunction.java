package org.jtwig.functions.impl.date;

import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatFunction extends SimpleJtwigFunction {

    private static NowDateSupplier dateSupplier = new NowDateSupplier() {

        @Override
        public Date now() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    };

    public static void setDateSupplier(NowDateSupplier dateSupplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String name() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object execute(FunctionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public interface NowDateSupplier {

        Date now();
    }
}
