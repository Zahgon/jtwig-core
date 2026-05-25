package org.jtwig.parser.config;

public class SyntaxConfiguration {

    private final String startComment;

    private final String endComment;

    private final String startOutput;

    private final String endOutput;

    private final String startCode;

    private final String endCode;

    public SyntaxConfiguration(String startComment, String endComment, String startOutput, String endOutput, String startCode, String endCode) {
        this.startComment = startComment;
        this.endComment = endComment;
        this.startOutput = startOutput;
        this.endOutput = endOutput;
        this.startCode = startCode;
        this.endCode = endCode;
    }

    public String getEndCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getStartComment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getEndComment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getStartOutput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getEndOutput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getStartCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
