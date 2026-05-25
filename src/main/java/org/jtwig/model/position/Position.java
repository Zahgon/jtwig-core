package org.jtwig.model.position;

import org.jtwig.resource.reference.ResourceReference;

public class Position {

    private final ResourceReference resource;

    private final int line;

    private final int column;

    public Position(ResourceReference resource, int line, int column) {
        this.resource = resource;
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getColumn() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
