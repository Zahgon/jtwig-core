package org.jtwig.render.context.model;

import com.google.common.base.Optional;
import org.jtwig.model.tree.BlockNode;
import org.jtwig.resource.reference.ResourceReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BlockContext {

    private final Map<String, LinkedList<BlockDefinition>> blocks;

    public BlockContext(Map<String, LinkedList<BlockDefinition>> blocks) {
        this.blocks = blocks;
    }

    public static BlockContext newContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<BlockDefinition> get(String identifier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<BlockDefinition> get(String identifier, int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Optional<BlockDefinition> pollFirst(String identifier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addLast(BlockNode node, ResourceReference source) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addLast(String identifier, BlockDefinition blockDefinition) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addFirst(BlockNode node, ResourceReference source) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void addFirst(String identifier, BlockDefinition blockDefinition) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private LinkedList<BlockDefinition> getOrAddStack(String identifier) {
        if (!blocks.containsKey(identifier)) {
            LinkedList<BlockDefinition> blockDefinitions = new LinkedList<>();
            blocks.put(identifier, blockDefinitions);
            return blockDefinitions;
        } else {
            return blocks.get(identifier);
        }
    }
}
