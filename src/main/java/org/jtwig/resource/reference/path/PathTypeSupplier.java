package org.jtwig.resource.reference.path;

import com.google.common.base.Function;
import com.google.common.base.Supplier;

public class PathTypeSupplier implements Supplier<PathType> {

    public static final String OS_NAME = "os.name";

    public static final String WIN = "win";

    private static final PathTypeSupplier INSTANCE = new PathTypeSupplier(new Function<String, String>() {

        @Override
        public String apply(String input) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    });

    public static PathTypeSupplier pathTypeSupplier() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final PathType type;

    PathTypeSupplier(Function<String, String> systemProperties) {
        String operatingSystem = systemProperties.apply(OS_NAME).toLowerCase();
        if (operatingSystem.contains(WIN)) {
            type = PathType.UNC;
        } else {
            type = PathType.POSIX;
        }
    }

    @Override
    public PathType get() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
