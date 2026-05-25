package org.jtwig.parser.parboiled;

import org.jtwig.parser.addon.AddonParserProvider;
import org.jtwig.parser.config.JtwigParserConfiguration;
import org.jtwig.parser.config.SyntaxConfiguration;
import org.jtwig.parser.parboiled.base.*;
import org.jtwig.parser.parboiled.expression.*;
import org.jtwig.parser.parboiled.expression.operator.BinaryOperatorParser;
import org.jtwig.parser.parboiled.expression.operator.UnaryOperatorParser;
import org.jtwig.parser.parboiled.expression.test.AnyTestExpressionParser;
import org.jtwig.parser.parboiled.expression.test.TestExpressionParser;
import org.jtwig.parser.parboiled.node.*;
import org.jtwig.render.expression.calculator.operation.binary.BinaryOperator;
import org.jtwig.render.expression.calculator.operation.unary.UnaryOperator;
import org.jtwig.resource.reference.ResourceReference;
import org.parboiled.BaseParser;
import java.util.*;
import static org.parboiled.Parboiled.createParser;

public class ParserContext {

    public static ParserContext instance(ResourceReference resource, JtwigParserConfiguration configuration, Collection<AddonParserProvider> addOnParsers, Collection<UnaryOperator> unaryOperators, Collection<BinaryOperator> binaryOperators, List<Class<? extends TestExpressionParser>> testExpressionParsers) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Collection<String> extraKeywords(Collection<AddonParserProvider> addOnParsers) {
        Collection<String> result = new ArrayList<>();
        for (AddonParserProvider provider : addOnParsers) {
            result.addAll(provider.keywords());
        }
        return result;
    }

    private final ResourceReference resource;

    private final JtwigParserConfiguration configuration;

    private final Map<Class, BaseParser> parsers;

    private final Collection<AddonParserProvider> addOnParsers;

    public ParserContext(ResourceReference resource, JtwigParserConfiguration configuration, Collection<AddonParserProvider> addOnParsers) {
        this.resource = resource;
        this.configuration = configuration;
        this.parsers = new HashMap<>();
        this.addOnParsers = addOnParsers;
    }

    public <T extends BaseParser> ParserContext register(Class type, T parser) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<AddonParserProvider> getAddOnParsers() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public <T extends BasicParser> T parser(Class<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SyntaxConfiguration syntaxConfiguration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public JtwigParserConfiguration getConfiguration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResourceReference resource() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
