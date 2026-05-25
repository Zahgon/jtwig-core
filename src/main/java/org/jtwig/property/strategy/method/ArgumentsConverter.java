package org.jtwig.property.strategy.method;

import com.google.common.base.Optional;
import org.jtwig.property.strategy.method.argument.group.ArgumentGroup;
import org.jtwig.property.strategy.method.argument.group.GroupingArgumentsService;
import org.jtwig.property.strategy.method.convert.Converter;
import org.jtwig.reflection.model.Value;
import org.jtwig.reflection.model.java.JavaMethod;
import java.util.ArrayList;
import java.util.List;

public class ArgumentsConverter {

    private final Converter converter;

    private final GroupingArgumentsService groupingArgumentsService;

    public ArgumentsConverter(Converter converter, GroupingArgumentsService groupingArgumentsService) {
        this.converter = converter;
        this.groupingArgumentsService = groupingArgumentsService;
    }

    public Optional<Object[]> convert(JavaMethod method, Object[] objects) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
