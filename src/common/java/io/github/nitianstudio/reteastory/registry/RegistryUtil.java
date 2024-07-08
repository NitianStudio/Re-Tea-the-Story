package io.github.nitianstudio.reteastory.registry;

import dev.architectury.registry.registries.DeferredRegister;
import io.github.nitianstudio.reteastory.Reteastory;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

public class RegistryUtil {
    public static final DeferredRegister<Block> blocks = DeferredRegister.create(Reteastory.MOD_ID, Registries.BLOCK);

    public static void registry() {
        RegistryBlock.registry();
        blocks.register();
    }
}
