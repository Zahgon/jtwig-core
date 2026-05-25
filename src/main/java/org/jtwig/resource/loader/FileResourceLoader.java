package org.jtwig.resource.loader;

import com.google.common.base.Optional;
import org.jtwig.resource.exceptions.ResourceNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

public class FileResourceLoader implements ResourceLoader {

    public static FileResourceLoader instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final File baseDirectory;

    public FileResourceLoader(File baseDirectory) {
        this.baseDirectory = baseDirectory;
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

    private File file(String path) {
        File file = new File(path);
        if (file.isAbsolute()) {
            return file;
        } else {
            return new File(baseDirectory, path);
        }
    }
}
