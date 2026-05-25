package org.jtwig.functions.impl.java;

import com.google.common.base.Optional;
import org.jtwig.functions.FunctionRequest;
import org.jtwig.functions.SimpleJtwigFunction;
import org.jtwig.reflection.model.Value;
import org.jtwig.reflection.model.java.JavaClass;
import org.jtwig.reflection.model.java.JavaConstant;
import org.jtwig.util.ClasspathFinder;

public class ConstantFunction extends SimpleJtwigFunction {

    private final ClasspathFinder classpathFinder;

    public ConstantFunction(ClasspathFinder classpathFinder) {
        this.classpathFinder = classpathFinder;
    }

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

    private Object getConstant(FunctionRequest request, String constant) {
        int constantNamePosition = constant.lastIndexOf(".");
        if (constantNamePosition == -1) {
            throw request.exception(String.format("Invalid constant specified '%s'", constant));
        }
        String className = constant.substring(0, constantNamePosition);
        String constantName = constant.substring(constantNamePosition + 1);
        Optional<JavaClass> optional = classpathFinder.load(className);
        if (optional.isPresent()) {
            Optional<JavaConstant> valueOptional = optional.get().constant(constantName);
            if (valueOptional.isPresent()) {
                Optional<Value> value = valueOptional.get().value();
                if (value.isPresent()) {
                    return value.get().getValue();
                } else {
                    throw request.exception(String.format("Unable to retrieve value of constant %s in class %s", constantName, className));
                }
            } else {
                throw request.exception(String.format("Class %s does not expose constant %s", className, constantName));
            }
        } else {
            throw request.exception(String.format("Class %s not found", className));
        }
    }
}
