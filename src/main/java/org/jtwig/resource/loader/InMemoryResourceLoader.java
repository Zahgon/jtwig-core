package org.jtwig.resource.loader;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import org.jtwig.resource.exceptions.ResourceNotFoundException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class InMemoryResourceLoader implements ResourceLoader {

    public static InMemoryResourceLoader.Builder builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final Map<String, Supplier<InputStream>> inputStreamMap;

    public InMemoryResourceLoader(Map<String, Supplier<InputStream>> inputStreamMap) {
        this.inputStreamMap = inputStreamMap;
    }

    @Override
    public Optional<Charset> getCharset(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public InputStream load(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean exists(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Optional<URL> toUrl(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder implements org.apache.commons.lang3.builder.Builder<InMemoryResourceLoader> {

        private final Map<String, Supplier<InputStream>> supplierMap = new HashMap<>();

        public Builder withResource(String key, String content) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public InMemoryResourceLoader build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class StringInputStreamSupplier implements Supplier<InputStream> {

        private final String content;

        public StringInputStreamSupplier(String content) {
            this.content = content;
        }

        @Override
        public InputStream get() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
