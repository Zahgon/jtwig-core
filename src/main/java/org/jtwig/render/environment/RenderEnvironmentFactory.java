package org.jtwig.render.environment;

import org.jtwig.render.RenderResourceService;
import org.jtwig.render.config.RenderConfiguration;
import org.jtwig.render.expression.CalculateExpressionService;
import org.jtwig.render.expression.ExpressionCalculatorSelector;
import org.jtwig.render.expression.calculator.operation.binary.BinaryOperationCalculatorSelector;
import org.jtwig.render.expression.calculator.operation.binary.BinaryOperationService;
import org.jtwig.render.expression.calculator.operation.unary.UnaryOperationCalculatorSelector;
import org.jtwig.render.expression.calculator.operation.unary.UnaryOperationService;
import org.jtwig.render.expression.test.CalculateTestExpressionService;
import org.jtwig.render.expression.test.TestExpressionCalculatorSelector;
import org.jtwig.render.listeners.RenderListener;
import org.jtwig.render.listeners.RenderListenerRegistry;
import org.jtwig.render.listeners.RenderStage;
import org.jtwig.render.listeners.StagedRenderListener;
import org.jtwig.render.node.NodeRenderSelector;
import org.jtwig.render.node.RenderNodeService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RenderEnvironmentFactory {

    public RenderEnvironment create(RenderConfiguration renderConfiguration) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
