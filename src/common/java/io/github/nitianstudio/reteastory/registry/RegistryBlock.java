package io.github.nitianstudio.reteastory.registry;

import cloud.lemonslice.teastory.common.block.BowlBlock;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

public enum RegistryBlock implements Supplier<Block> {
    WOODEN_BOWL(properties -> new BowlBlock(properties.noOcclusion().strength(0.4f)));
    private final RegistrySupplier<Block> block;

    RegistryBlock(String name, Function<BlockBehaviour.Properties, Block> function, @Nullable Block block) {
        this.block = RegistryUtil.blocks.register(name.toLowerCase(Locale.ROOT), () -> function
                .apply(
                        block == null ?
                                BlockBehaviour.Properties.of()
                                :BlockBehaviour.Properties.ofFullCopy(block)
                ));
    }

    RegistryBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        this(name, function, null);
    }
    RegistryBlock(Function<BlockBehaviour.Properties, Block> function, @Nullable Block block) {
        this.block = RegistryUtil.blocks.register(name().toLowerCase(Locale.ROOT), () -> function
                .apply(
                        block == null ?
                                BlockBehaviour.Properties.of()
                                :BlockBehaviour.Properties.ofFullCopy(block)
                ));
    }

    RegistryBlock(Function<BlockBehaviour.Properties, Block> function) {
        this(function, null);
    }

    public static void registry() {}

    @Override
    public Block get() {
        return block.get();
    }
}
