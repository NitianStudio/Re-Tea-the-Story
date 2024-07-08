package io.github.nitianstudio.reteastory.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.Locale;

public enum RegistryTileEntity {
    ;

    private final RegistrySupplier<BlockEntityType<? extends BlockEntity>> tileEntity;

    RegistryTileEntity() {
        tileEntity = RegistryUtil.tiles.register(name().toLowerCase(Locale.ROOT), () -> BlockEntityType.Builder.of())
    }

    public static void registry() {

    }
}
