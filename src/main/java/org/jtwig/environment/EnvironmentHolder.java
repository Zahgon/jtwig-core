package org.jtwig.environment;

public class EnvironmentHolder {

    private static ThreadLocal<Environment> instance = new InheritableThreadLocal<>();

    public static Environment get() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Environment set(Environment environment) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
