package org.jtwig.render.config;

import org.jtwig.model.expression.Expression;
import org.jtwig.model.expression.test.TestExpression;
import org.jtwig.model.tree.Node;
import org.jtwig.render.expression.calculator.ExpressionCalculator;
import org.jtwig.render.expression.calculator.operation.binary.BinaryOperator;
import org.jtwig.render.expression.calculator.operation.binary.calculators.BinaryOperationCalculator;
import org.jtwig.render.expression.calculator.operation.unary.UnaryOperator;
import org.jtwig.render.expression.calculator.operation.unary.calculators.UnaryOperationCalculator;
import org.jtwig.render.expression.test.calculator.TestExpressionCalculator;
import org.jtwig.render.listeners.StagedRenderListener;
import org.jtwig.render.node.renderer.NodeRender;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

public class RenderConfiguration {

    private final boolean strictMode;

    private final Charset defaultOutputCharset;

    private final Map<Class<? extends Node>, NodeRender> renders;

    private final Map<Class<? extends Expression>, ExpressionCalculator> calculators;

    private final Map<Class<? extends BinaryOperator>, BinaryOperationCalculator> binaryCalculators;

    private final Map<Class<? extends UnaryOperator>, UnaryOperationCalculator> unaryCalculators;

    private final Map<Class<? extends TestExpression>, TestExpressionCalculator> testExpressionCalculators;

    private final Collection<StagedRenderListener> renderListeners;

    public RenderConfiguration(boolean strictMode, Charset defaultOutputCharset, Map<Class<? extends Node>, NodeRender> renders, Map<Class<? extends Expression>, ExpressionCalculator> calculators, Map<Class<? extends BinaryOperator>, BinaryOperationCalculator> binaryCalculators, Map<Class<? extends UnaryOperator>, UnaryOperationCalculator> unaryCalculators, Map<Class<? extends TestExpression>, TestExpressionCalculator> testExpressionCalculators, Collection<StagedRenderListener> renderListeners) {
        this.strictMode = strictMode;
        this.defaultOutputCharset = defaultOutputCharset;
        this.renders = renders;
        this.calculators = calculators;
        this.binaryCalculators = binaryCalculators;
        this.unaryCalculators = unaryCalculators;
        this.testExpressionCalculators = testExpressionCalculators;
        this.renderListeners = renderListeners;
    }

    public boolean getStrictMode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Charset getDefaultOutputCharset() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<Class<? extends Node>, NodeRender> getNodeRenders() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<Class<? extends Expression>, ExpressionCalculator> getExpressionCalculators() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<Class<? extends BinaryOperator>, BinaryOperationCalculator> getBinaryExpressionCalculators() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<Class<? extends UnaryOperator>, UnaryOperationCalculator> getUnaryExpressionCalculators() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<Class<? extends TestExpression>, TestExpressionCalculator> getTestExpressionCalculators() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Collection<StagedRenderListener> getRenderListeners() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
