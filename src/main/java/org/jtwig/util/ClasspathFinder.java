package org.jtwig.util;

import com.google.common.base.Optional;
import org.jtwig.reflection.model.java.JavaClass;
import org.jtwig.reflection.model.java.JavaClassManager;
import static java.lang.Class.forName;

public class ClasspathFinder {

    private final ClassLoader classLoader;

    private final JavaClassManager javaClassManager;

    public ClasspathFinder(ClassLoader classLoader, JavaClassManager javaClassManager) {
        this.classLoader = classLoader;
        this.javaClassManager = javaClassManager;
    }

    public boolean exists(String className) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<JavaClass> load(String className) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
