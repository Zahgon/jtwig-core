package org.jtwig.model.tree;

import org.jtwig.model.position.Position;

public class TextNode extends Node {

    private final String text;

    private final Configuration configuration;

    public TextNode(Position position, String text, Configuration configuration) {
        super(position);
        this.text = text;
        this.configuration = configuration;
    }

    public String getText() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public TextNode trimRight(boolean trimRight) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Configuration getConfiguration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Configuration {

        private boolean trimLeft;

        private boolean trimRight;

        public boolean isTrimLeft() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Configuration setTrimLeft(boolean trimLeft) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public boolean isTrimRight() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Configuration setTrimRight(boolean trimRight) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
