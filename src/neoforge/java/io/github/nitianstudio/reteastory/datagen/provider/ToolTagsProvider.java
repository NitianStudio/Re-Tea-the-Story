package io.github.nitianstudio.reteastory.datagen.provider;

import io.github.nitianstudio.reteastory.Reteastory;
import io.github.nitianstudio.reteastory.registry.RegistryBlock;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ToolTagsProvider extends BlockTagsProvider {


    public ToolTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Reteastory.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE).add(RegistryBlock.WOODEN_BOWL.get());
    }

    @Override
    public @NotNull String getName() {
        return "Re-Tea-story Need Tool Generation";
    }
}
