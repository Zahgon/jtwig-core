package org.jtwig.property.selection;

import com.google.common.base.Optional;
import org.jtwig.property.resolver.PropertyResolver;
import org.jtwig.property.selection.cache.SelectionPropertyResolverCache;
import org.jtwig.property.selection.cache.SelectionPropertyResolverCacheKey;

public class CachedSelectionPropertyResolver implements SelectionPropertyResolver {

    private final SelectionPropertyResolverCache selectionPropertyResolverCache;

    private final SelectionPropertyResolver delegate;

    private final SelectionPropertyResolveService selectionPropertyResolveService;

    public CachedSelectionPropertyResolver(SelectionPropertyResolverCache selectionPropertyResolverCache, SelectionPropertyResolver delegate, SelectionPropertyResolveService selectionPropertyResolveService) {
        this.selectionPropertyResolverCache = selectionPropertyResolverCache;
        this.delegate = delegate;
        this.selectionPropertyResolveService = selectionPropertyResolveService;
    }

    @Override
    public SelectionResult resolve(SelectionRequest request) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
