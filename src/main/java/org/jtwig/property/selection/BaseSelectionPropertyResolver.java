package org.jtwig.property.selection;

import com.google.common.base.Optional;
import org.jtwig.property.resolver.EmptyPropertyResolver;
import org.jtwig.property.resolver.PropertyResolver;
import org.jtwig.property.strategy.PropertyResolverStrategy;
import org.jtwig.reflection.model.Value;
import org.jtwig.value.Undefined;
import java.util.Collection;

public class BaseSelectionPropertyResolver implements SelectionPropertyResolver {

    private final Collection<PropertyResolverStrategy> strategies;

    private final SelectionPropertyResolveService selectionPropertyResolveService;

    public BaseSelectionPropertyResolver(Collection<PropertyResolverStrategy> strategies, SelectionPropertyResolveService selectionPropertyResolveService) {
        this.strategies = strategies;
        this.selectionPropertyResolveService = selectionPropertyResolveService;
    }

    @Override
    public SelectionResult resolve(SelectionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
