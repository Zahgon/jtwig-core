package org.jtwig.parser.config;

import org.apache.commons.lang3.builder.Builder;

public class SyntaxConfigurationBuilder<B extends SyntaxConfigurationBuilder> implements Builder<SyntaxConfiguration> {

    private String startComment;

    private String endComment;

    private String startOutput;

    private String endOutput;

    private String startCode;

    private String endCode;

    public SyntaxConfigurationBuilder() {
    }

    public SyntaxConfigurationBuilder(SyntaxConfiguration prototype) {
        this.startComment = prototype.getStartComment();
        this.endComment = prototype.getEndComment();
        this.startOutput = prototype.getStartOutput();
        this.endOutput = prototype.getEndOutput();
        this.startCode = prototype.getStartCode();
        this.endCode = prototype.getEndCode();
    }

    public B withStartComment(String startComment) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public B withEndComment(String endComment) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public B withStartOutput(String startOutput) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public B withEndOutput(String endOutput) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public B withStartCode(String startCode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public B withEndCode(String endCode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected B self() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public SyntaxConfiguration build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
