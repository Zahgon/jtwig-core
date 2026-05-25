package org.jtwig.parser.parboiled;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import org.apache.commons.lang3.StringUtils;
import org.jtwig.environment.Environment;
import org.jtwig.model.tree.Node;
import org.jtwig.parser.JtwigParser;
import org.jtwig.parser.ParseException;
import org.jtwig.parser.config.JtwigParserConfiguration;
import org.jtwig.parser.util.ParboiledExceptionMessageExtractor;
import org.jtwig.resource.ResourceService;
import org.jtwig.resource.metadata.ResourceMetadata;
import org.jtwig.resource.reference.ResourceReference;
import org.parboiled.errors.ParseError;
import org.parboiled.errors.ParserRuntimeException;
import org.parboiled.parserunners.BasicParseRunner;
import org.parboiled.support.ParsingResult;
import java.nio.charset.Charset;
import java.util.List;
import static org.parboiled.common.FileUtils.readAllText;

public class ParboiledJtwigParser implements JtwigParser {

    private final ParboiledExceptionMessageExtractor exceptionMessageExtractor = new ParboiledExceptionMessageExtractor();

    private final JtwigParserConfiguration configuration;

    public ParboiledJtwigParser(JtwigParserConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Node parse(Environment environment, ResourceReference resource) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String toMessage(List<ParseError> parseErrors) {
        return StringUtils.join(Collections2.transform(parseErrors, new Function<ParseError, String>() {

            @Override
            public String apply(ParseError input) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        }), "\n");
    }
}
