package org.jtwig.resource;

import com.google.common.base.Optional;
import org.jtwig.resource.exceptions.ResourceException;
import org.jtwig.resource.loader.ResourceLoader;
import org.jtwig.resource.loader.TypedResourceLoader;
import org.jtwig.resource.metadata.EmptyResourceMetadata;
import org.jtwig.resource.metadata.ResourceMetadata;
import org.jtwig.resource.metadata.ResourceResourceMetadata;
import org.jtwig.resource.reference.ResourceReference;
import org.jtwig.resource.reference.ResourceReferenceExtractor;
import org.jtwig.resource.resolver.RelativeResourceResolver;
import org.jtwig.value.environment.ValueEnvironment;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ResourceService {

    private final Map<String, ResourceLoader> loaderMap;

    private final List<TypedResourceLoader> loaderList;

    private final Collection<String> absoluteResourceTypes;

    private final Collection<RelativeResourceResolver> relativeResourceResolvers;

    private final ResourceReferenceExtractor resourceReferenceExtractor;

    public ResourceService(Map<String, ResourceLoader> loaderMap, List<TypedResourceLoader> loaderList, Collection<String> absoluteResourceTypes, Collection<RelativeResourceResolver> relativeResourceResolvers, ResourceReferenceExtractor resourceReferenceExtractor) {
        this.loaderMap = loaderMap;
        this.loaderList = loaderList;
        this.absoluteResourceTypes = absoluteResourceTypes;
        this.relativeResourceResolvers = relativeResourceResolvers;
        this.resourceReferenceExtractor = resourceReferenceExtractor;
    }

    public ResourceReference resolve(ResourceReference current, Object path, ValueEnvironment valueEnvironment) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResourceReference resolve(ResourceReference current, String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ResourceMetadata loadMetadata(ResourceReference reference) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private Optional<ResourceLoader> getFirstExistingResourceLoader(ResourceReference reference) {
        for (TypedResourceLoader typedResourceLoader : loaderList) {
            if (!ResourceReference.STRING.equals(typedResourceLoader.getType()) && typedResourceLoader.getResourceLoader().exists(reference.getPath())) {
                return Optional.of(typedResourceLoader.getResourceLoader());
            }
        }
        return Optional.absent();
    }
}
